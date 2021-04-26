package ciphertools.imagecipher.converters;

import ciphertools.imagecipher.imagedata.*;

/**
 * Class used to convert binary sequences into RGB color codes.
 * 
 * @author wpnx777
 * @version 1.0
 */
public class BinaryToRGBConverter {
  //Constructors
  /**
   * Parameterized constructor that will call the convertBinaryToRGB() which
   * will convert the parameter ImageData objects binary sequences into 
   * RGB color codes. 
   * 
   * @param encryptedImageData 
   * @author wpnx777
   * @version 1.0
   */
  public BinaryToRGBConverter(ImageData encryptedImageData) {
    convertBinaryToRGB(encryptedImageData);
  }// End Method
  
  /**
   * Convert the parameter ImageData objects binary sequences into 
   * RGB color codes. 
   * 
   * @param encryptedImageData 
   * @author wpnx777
   * @version 1.0
   */
  public void convertBinaryToRGB(ImageData encryptedImageData) {
    int red,green,blue = 0;

    for(int i = 0; i < encryptedImageData.getPixelRGBData().length; i++) {
      for(int j = 0; j < encryptedImageData.getPixelRGBData()[i].length; j++) {
        red = Integer.parseInt((String)encryptedImageData.
                getPixelBinaryData()[i][j].toString().subSequence(0,8),2);

        green = Integer.parseInt((String)encryptedImageData.
                  getPixelBinaryData()[i][j].toString().subSequence(8,16),2);

        blue = Integer.parseInt((String)encryptedImageData.
                 getPixelBinaryData()[i][j].toString().subSequence(16,24),2);
        
        encryptedImageData.setRGBColorDataAt(i, j, red, green, blue);
      }//End For
    }//End For
  }// End Method
}//End Class