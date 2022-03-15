package com.xqf.plane;

import java.awt.*;

/**
 * @Classname Shell
 * @Date 2021/4/1
 * @Author xqf
 */
public class Shell extends GameObject {
    double degree;  //角度，炮弹沿着指定的角度飞行

    public Shell() {
        x = 200;
        y = 200;

        degree = Math.random() * Math.PI * 2;

        width = 10;
        height = 10;

        speed = 3;
    }

    @Override
    public void drawMyself(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.yellow);

        g.fillOval((int) x, (int) y, width, height);

        g.setColor(c);

        //根据自己的算法指定移动的路径
        x += speed * Math.cos(degree);
        y += speed * Math.sin(degree);

        //碰到边界改变方向
        if (y > Constant.GAME_HEIGHT - this.height * 2 || y < 45) {
            degree = -degree;
        }
        if (x < 5 || x > Constant.GANE_WIDTH - this.width * 2) {
            degree = Math.PI - degree;
        }


    }
}
