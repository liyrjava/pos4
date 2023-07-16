package com.bjsxt.plane;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGameFrame extends Frame {
    @Override
    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.BLUE);
        g.setColor(c);
        g.drawRect(100,100,200,300);

    }

    public  void launchFrame()
    {
        this.setTitle("王伊琳加油宝贝");
        setVisible(true);
        setSize(500,500);
        setLocation(400,400);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }


public static  void main(String[] args)
{

    MyGameFrame gameFrame = new MyGameFrame();
    gameFrame.launchFrame();
}
}