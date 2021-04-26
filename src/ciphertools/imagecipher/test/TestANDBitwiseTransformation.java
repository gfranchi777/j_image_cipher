package ciphertools.imagecipher.test;

import java.awt.image.*;
import java.io.*;

import javax.imageio.*;

import ciphertools.imagecipher.binarytransformation.*;
import ciphertools.imagecipher.imagedata.*;
import ciphertools.imagecipher.utils.*;

public class TestANDBitwiseTransformation {
  public static void main(String[] args) {
    try {
      String imagePath = "src/ciphertools/imagecipher/resources/testimages/" + 
                         "test.image.bwrgb.1.row.png";
      
      //String imagePath = "src/ciphertools/imagecipher/resources/testimages/" + 
      //                   "test.image.bwrgb.2.rows.png";
      
      //String imagePath = "src/ciphertools/imagecipher/resources/testimages/" + 
      //                   "test.image.devil.face.png";
      
      BufferedImage sourceImage = ImageIO.read(new File(imagePath));
      
      System.out.println("Image Height: " + sourceImage.getHeight());
      System.out.println("Image Width : " + sourceImage.getWidth());
      System.out.println();
      
      ImageData sourceImageData = new ImageData(sourceImage);
      ImageData encryptedImageData = new ImageData(sourceImage);
      
      CoinToss coinToss = new CoinToss(
                                BinarySequence.NUM_DIGITS_IN_BIN_SEQ);

      new ANDBitwiseTransformation(sourceImageData, coinToss,
                                   encryptedImageData);

      for(int i = 0; i < sourceImageData.getImageHeight(); i++) {
        for(int j = 0; j < sourceImageData.getImageWidth(); j++) {
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
          System.out.print("Coin Toss Sequence: ");
          coinToss.printSequence();
          System.out.println("                    ------------------------");
          System.out.print("AND Transformation: ");
          encryptedImageData.getPixelBinaryData()[i][j].printPixelBinaryData();
          System.out.println("============================================");
          
        }//End For
      }//End For
    } catch(IOException e) {
      e.printStackTrace();
    }//End Try
  }//End Main Method
}// End Class
