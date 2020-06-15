import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.*;

import javax.imageio.ImageIO;

class ReadColor {
   BufferedImage image;
   int width;
   int height;
   
   public ReadColor() {
      try {
         File file = new File("christmasminion.png");
         image = ImageIO.read(file);
         width = image.getWidth();
         height = image.getHeight();
         
         int count = 0;
         
         for(int i=0; i<height; i++) {
         
            for(int j=0; j<width; j++) {
            
               count++;
               Color c = new Color(image.getRGB(j, i));
               System.out.println("Square Nr: " + count + " Red: " + c.getRed() +"  Green: " + c.getGreen() + " Blue: " + c.getBlue());
            }
         }

      } catch (Exception e) {}
   }
   
   static public void main(String args[]) throws Exception {
      ReadColor obj = new ReadColor();
   }
}