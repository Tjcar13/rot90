/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rot90;

import com.sun.glass.ui.Pixels;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Thomas
 */
public class Rot90 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        BufferedImage inputImage = ImageIO.read(new File("C:/Users/Thomas/Desktop/bigredFootball.jpg"));
       // BufferedImage nImage = new BufferedImage(inputImage.getWidth(), inputImage.getHeight(), BufferedImage.TYPE_INT_RGB);
        //Raster raster = inputImage.getData();
         int w=inputImage.getWidth(),h=inputImage.getHeight();
         int pixels[][]=new int[w][h];
         for (int x=0;x<w;x++)
            {
             for(int y=0;y<h;y++)
                {
                 pixels[x][y]=inputImage.getRGB(x, y);
                 }
            }
       // rotateAntiClockWise(Pixels[][] nImage); 
       int[][] rotate = pixels;
       int[][] outputImage = new int[h][w];
       // BufferedImage outputImage = new BufferedImage(inputImage.getWidth(), inputImage.getHeight(), BufferedImage.TYPE_INT_RGB);
    // TODO code application logic here
    
   for(int y = 0; y < inputImage.getHeight();  y++)
        {
           // outputImage[y] = new int[inputImage.getWidth()];
            for(int x = 0; x < inputImage.getWidth(); x++)
            {
                outputImage[y][x] = rotate[x][y];
                inputImage.setRGB(x, y, outputImage[y][x]);
            }
    
        }
    ImageIO.write(inputImage, "PNG", new File("c:/Users/Thomas/Desktop/NewPhoto4.png") );
    }
    
}
