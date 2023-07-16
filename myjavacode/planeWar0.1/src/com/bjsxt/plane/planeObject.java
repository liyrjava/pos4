package com.bjsxt.plane;

import java.awt.*;
import java.awt.event.KeyEvent;

public class planeObject extends  gameObject {
    boolean  left ,right ,up,down;
    boolean live= true;



    @Override
    public void draw(Graphics g) {
        if (live)
        {
            super.draw(g);
            if (left)
            {
                x-=speed;
            }
            if (right)
            {
                x+=speed;
            }
            if (up)
            {
                y-=speed;
            }
            if (down)
            {
                y+=speed;
            }
        }

       // x= x+speed;
    }

    public  void  addDirection(KeyEvent e)
    {
        if(e.getKeyCode()==KeyEvent.VK_LEFT)
        {
            left=true;
        }
        if(e.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            right=true;
        }
        if(e.getKeyCode()==KeyEvent.VK_UP)
        {
            up=true;
        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN)
        {
            down=true;
        }
    }
    public  void  minusDirection(KeyEvent e)
    {
        if(e.getKeyCode()==KeyEvent.VK_LEFT)
        {
            left=false;
        }

        if(e.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            right=false;
        }
        if(e.getKeyCode()==KeyEvent.VK_UP)
        {
            up=false;
        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN)
        {
            down=false;
        }
    }
    public planeObject(Image image, double x, double y, int speed) {
        super(image, x, y, speed);
    }
}
