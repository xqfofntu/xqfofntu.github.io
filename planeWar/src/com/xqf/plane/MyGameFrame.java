package com.xqf.plane;

/*
 *游戏主窗口
 */


import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

public class MyGameFrame extends Frame {


    Image planeImg = GameUtil.getImage("images/plane.png");
    Image bj = GameUtil.getImage("images/bj.jpg");

    Plane p1 = new Plane(planeImg, 100, 100, 7);

    Shell[] shells = new Shell[50];

    Explode explode;   //爆炸

    Date start = new Date();  //游戏开始的时间
    Date end;//游戏结束时间
    long period = 0;   //存活了多少秒

    @Override
    public void paint(Graphics g) {
        //画背景
        g.drawImage(bj, 0, 0, 600, 600, null);

        //画时间
        drawTime(g);

        //画飞机
        p1.drawMyself(g);

        //画炮弹
        for (int i = 0; i < shells.length; i++) {
            shells[i].drawMyself(g);

            //碰撞检测，将所有的炮弹和飞机进行检测，看有没有碰撞
            boolean peng = shells[i].getRect().intersects(p1.getRect());
            if (peng) {
//                System.out.println("飞机被击中了！！！");
                p1.live = false;

                //处理爆炸效果
                if (explode == null) {
                    explode = new Explode(p1.x, p1.y);
                }
                explode.drawMySelf(g);
            }
        }

    }

    public void drawTime(Graphics g) {
        Color c = g.getColor();
        Font f = g.getFont();

        g.setColor(Color.green);
        if (p1.live) {
            period = (System.currentTimeMillis() - start.getTime()) / 1000;
            g.drawString("坚持" + period, 30, 50);
        } else {
            if (end == null) {
                end = new Date();
                period = (end.getTime() - start.getTime()) / 1000;
            }
            g.setColor(Color.red);
            g.setFont(new Font("微软雅黑", Font.BOLD, 30));
            g.drawString("最终时间" + period, 200, 200);
        }
        g.setColor(c);
        g.setFont(f);

    }

    //初始化窗口
    public void launchFrame() {
        this.setTitle("飞机大战-许琦峰");
        setVisible(true);     //窗口是否可见
        setSize(Constant.GANE_WIDTH, Constant.GAME_HEIGHT);    //窗口大小
        setLocation(100, 100);     //窗口打开位置

        //增加关闭窗口的动作
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);   //正常退出程序
            }
        });

        new PaintTread().start();   //启动重画窗口的线程

        this.addKeyListener(new keyMonitor());    //启动键盘监听

        //初始化创建50个炮弹对象
        for (int i = 0; i < 50; i++) {
            shells[i] = new Shell();
        }
    }

    //定义了一个重画窗口的线程类
    //定义成内部类是为了方便直接使用窗口类的相关方法
    class PaintTread extends Thread {
        @Override
        public void run() {
            while (true) {
                repaint();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //内部类，实现键盘的监听
    class keyMonitor extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
//            System.out.println("按下：" + e.getKeyCode());

//            if (e.getKeyCode() == KeyEvent.VK_LEFT){
//                left = true;
//            }
            p1.addDirection(e);

        }

        @Override
        public void keyReleased(KeyEvent e) {
//            System.out.println("抬起：" + e.getKeyCode());

//            if (e.getKeyCode() == KeyEvent.VK_LEFT){
//                left = false;
//            }
            p1.minusDirection(e);

        }
    }

    private Image offScreenImage = null;

    @Override
    public void update(Graphics g) {
        if (offScreenImage == null) {
            offScreenImage = this.createImage(Constant.GANE_WIDTH, Constant.GAME_HEIGHT);//这是游戏窗口的宽度和高度
        }
        Graphics gOff = offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage, 0, 0, null);
    }

    public static void main(String[] args) {
        MyGameFrame gameFrame = new MyGameFrame();
        gameFrame.launchFrame();
    }


}
