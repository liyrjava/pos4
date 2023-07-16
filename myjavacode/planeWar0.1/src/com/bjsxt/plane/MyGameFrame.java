package com.bjsxt.plane;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import static java.awt.Font.BOLD;


public class MyGameFrame extends Frame {
    Image plane = GameUtil.getImage("image/plane.png");
    Image bg = GameUtil.getImage("image/bg.jpg");
   static  int count =0;


   //gameObject p1= new gameObject(plane,100,100,1,33,22);
    //gameObject p2= new gameObject(plane,200,100,1,33,22);
    planeObject p1 = new planeObject(plane,100,100,10);

    shell[] shells = new shell[10];
    explode explode;
    Date start= new Date();
    Date end ;
    long period;


    //planeObject p2 = new planeObject(plane,100,200,1);
   // planeObject p3= new planeObject(plane,100,300,1);

   // int planex=100;
    @Override

    public void paint(Graphics g) {
        //System.out.println(count);
        count++;
        /*Color c = g.getColor();
        g.setColor(new Color(255,0,255) );

        g.drawRect(100,100,200,300);
         g.setColor(c);*/
      g.drawImage(bg,0,0,Constant.game_wdith,Constant.game_height,null);

        drawTime(g);
      p1.draw(g);

      for(int i=0; i<shells.length;i++)
      {
          shells[i].draw(g);
         boolean peng= shells[i].getrect().intersects(p1.getrect());
         if (peng)
         {
             //System.out.println("飞机被炮弹击中了！！！");
             p1.live=false;
             if (explode == null)
             {
                 explode = new explode(p1.x, p1.y);
             }
             explode.draw(g);
         }

      }

        // p2.draw(g);
        //p3.draw(g);
        //g.drawImage(plane,planex,100,24,13,null);
        //planex+=1;
    }

    public  void drawTime(Graphics g)
    {
        Color c = g.getColor();
        Font f = g.getFont();
        if(p1.live) {
            g.setColor(Color.green);
            period = (System.currentTimeMillis() - start.getTime()) / 1000;
            g.drawString("坚持： " + period, 30, 50);
        }
        else
        {
            if(end == null)
            {
                end = new Date();
            }
                g.setColor(Color.red);
                g.setFont(new Font("微软雅黑",BOLD,30));
                period=(end.getTime()-start.getTime())/1000;
                g.drawString("最终时间： " + period, 200, 200);



        }
    }

    public  void launchFrame()
    {
        this.setTitle("王伊琳加油宝贝");
        setVisible(true);
        setSize(Constant.game_wdith,Constant.game_height);
        setLocation(400,400);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        new paintthread().start();
        this.addKeyListener(new keyMonitor());

        for (int j=0 ;j<shells.length;j++)
        {
            shells[j]= new shell();
        }

    }
    class paintthread extends Thread
    {

        @Override
        public void run() {
            while (true)
            {
                repaint();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class  keyMonitor extends KeyAdapter

    {
        @Override
        public void keyPressed(KeyEvent e) {
          // System.out.println("按下"+ e.getKeyCode());
            p1.addDirection(e);

        }

        @Override
        public void keyReleased(KeyEvent e) {
            p1.minusDirection(e);
        }
    }


    private Image offScreenImage=null;
    public  void update(Graphics g)

    {

        if(offScreenImage==null)
            offScreenImage=this.createImage(Constant.game_wdith,Constant.game_height);

        Graphics off = offScreenImage.getGraphics();
        paint(off);
        g.drawImage(offScreenImage,0,0,null);

    }


public static  void main(String[] args)
{

    MyGameFrame gameFrame = new MyGameFrame();
    gameFrame.launchFrame();
}



}