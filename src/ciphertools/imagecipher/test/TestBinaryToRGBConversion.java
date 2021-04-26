package ciphertools.imagecipher.test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import ciphertools.imagecipher.converters.*;
import ciphertools.imagecipher.imagedata.*;

public class TestBinaryToRGBConversion {
  public static void main(String[] args) {
    try {
      //String imagePath = "src/ciphertools/imagecipher/resources/testimages/" + 
      //                   "test.image.bwrgb.1.row.png";
    
      //String imagePath = "src/ciphertools/imagecipher/resources/testimages/" + 
      //                   "test.image.bwrgb.2.rows.png";
      
      String imagePath = "src/ciphertools/imagecipher/resources/testimages/" + 
                         "test.image.devil.face.png";
      
      BufferedImage sourceImage = ImageIO.read(new File(imagePath));
      BufferedImage encryptedImage = ImageIO.read(new File(imagePath));

      System.out.println("Image Height: " + sourceImage.getHeight());
      System.out.println("Image Width : " + sourceImage.getWidth());
      System.out.println();
      
      ImageData sourceImageData = new ImageData(sourceImage);
      ImageData encryptedImageData = new ImageData(encryptedImage);
      new BinaryToRGBConverter(encryptedImageData);

      for(int i = 0; i < sourceImageData.getImageHeight(); i++) {
        for(int j = 0; j < sourceImageData.getImageWidth(); j++) {
          /*
          System.out.println("============================================");
          System.out.println("--------------------------------------------");
          System.out.println("Source Image Pixel Data [" + i + "," + j + "]");
          System.out.println("--------------------------------------------");
          System.out.println("RGB Pixel Data:");
          System.out.println();
          sourceImageData.getPixelRGBData()[i][j].printPixelRGB();
          System.out.println("--------------------------------------------");
          System.out.print("RGB Binary String : "); 
          sourceImageData.getPixelBinaryData()[i][j].printPixelBinaryData();
          System.out.println("============================================");
          */
          sourceImageData.getPixelBinaryData()[i][j].printPixelBinaryData();
        }//End For
      }//End For
    } catch(IOException e) {
      
    }//End Try
  }// End Main Method
}
