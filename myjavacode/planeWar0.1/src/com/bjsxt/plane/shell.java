package com.bjsxt.plane;

import java.awt.*;

///炮弹类
public class shell extends  gameObject{
    double degree;

    public shell()
    {
        x=200;
        y=200;
        degree=Math.random()*2*Math.PI;
        height=10;
        wdiht=10;
        speed=7;

    }

    @Override
    public void draw(Graphics g) {
        Color color = g.getColor();
        g.setColor(Color.yellow);
      g.fillOval((int)x,(int)y,wdiht,height);
        g.setColor(color);
        x= x+speed*Math.cos(degree);
        y= y+speed*Math.sin(degree);


        if(y>Constant.game_height-this.height||y<0)
        {
            degree= -degree;
        }

        if(x>Constant.game_wdith-this.wdiht||x<0)
        {
            degree= Math.PI -degree;
        }
    }

}
