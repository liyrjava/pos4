package com.bjsxt.plane;

import java.awt.*;

public class gameObject {
    Image image;
    double  x ,y;
    int speed;
    int wdiht ,height;

    public gameObject(Image image, double x, double y, int speed, int wdiht, int height) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.wdiht = wdiht;
        this.height = height;
    }

    public gameObject(Image image, double x, double y, int speed) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.wdiht = image.getWidth(null);
        this.height= image.getWidth(null);
    }

    public  gameObject()
    {

    }

    public  void draw(Graphics g)
    {
        g.drawImage(image,(int)x,(int)y,wdiht,height,null);
    }

    public  Rectangle getrect()
    {
        return new Rectangle((int)x,(int)y,wdiht,height);
    }
}
