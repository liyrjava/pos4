package com.bjsxt.plane;

import java.awt.*;

public class explode {
    double x,y;
    int count;
     static Image imgs[] = new Image[16];
     static
     {
         for(int i=0;i<16;i++)
         {
             imgs[i]= GameUtil.getImage("image/explode/e"+(i+1)+".gif");
             imgs[i].getWidth(null);
         }

     }

     public  void draw(Graphics g)
     {
         if(count<16) {
             g.drawImage(imgs[count], (int) x, (int) y, null);
             count++;
         }
     }
     public  explode()
     {

     }

    public explode(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
