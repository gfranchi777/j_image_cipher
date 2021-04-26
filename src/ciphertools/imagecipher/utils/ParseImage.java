package ciphertools.imagecipher.utils;

import java.awt.image.*;
import ciphertools.imagecipher.converters.*;
import ciphertools.imagecipher.imagedata.*;

/**
 * Parse an image into a two dimensional array of RGB data
 * 
 * @author wpnx777
 */
public class ParseImage {
  /**
   * Default Constructor
   * 
   * @param image The image we want to parse
   * @param sourceImageData The object we will store the RGB data in
   */
  public ParseImage(BufferedImage image, ImageData sourceImageData) {
      parseImage(image, sourceImageData);
  }//End Method
 
  /**
   * Parse the image into a two dimensional array of RGB data
   * 
   * @param image The image we want to parse
   * @param sourceImageData The object we will store the RGB data in
   */
  public void parseImage(BufferedImage image, ImageData sourceImageData) {
    int pixelRGB =  0;
    
    for (int i = 0; i < image.getHeight(); i++) {
      for (int j = 0; j < image.getWidth(); j++) {
        pixelRGB = image.getRGB(j, i);

        sourceImageData.setRGBColorDataAt(i,j,((pixelRGB >> 16) & 0xff),
                                         ((pixelRGB >> 8) & 0xff),
                                         ((pixelRGB) & 0xff));
      }//End For
    }//End For
    new RGBToBinaryConverter(sourceImageData);
  }//End Method
}//End Class