package com.xqf.plane;

import java.awt.*;

/**
 * @Classname GameObject
 * @Date 17:20
 * @Author xqf
 */

//游戏物体的根类
public class GameObject {
    Image img;            //图片
    double x, y;           //物体坐标
    int speed;            //物体的速度
    int width, height;     //物体的高度

    public GameObject(Image img, double x, double y, int speed, int width, int height) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.width = width;
        this.height = height;
    }

    public GameObject(Image img, double x, double y, int speed) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.speed = speed;

        this.width = img.getWidth(null);
        this.height = img.getHeight(null);
    }

    public GameObject() {

    }

    public void drawMyself(Graphics g) {
        g.drawImage(img, (int) x, (int) y, width, height, null);
    }

    //所有的物体都是矩形，当你获得对应的矩形的时候，我们就可以做一些判断
    public Rectangle getRect() {
        return new Rectangle((int) x, (int) y, width, height);
    }


}
