package com.bjsxt.plane;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

public class GameUtil {

    public  static Image getImage(String path)
    {
       URL u= GameUtil.class.getClassLoader().getResource(path);
        BufferedImage image=null;

        try {
            image =ImageIO.read(u);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return   image;

    }
    public static void main(String[] args) {
       Image m=  getImage("image/plane.png");
       System.out.println(m);
    }
}
