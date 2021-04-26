package ciphertools.imagecipher.converters;

import ciphertools.imagecipher.imagedata.ImageData;
import ciphertools.imagecipher.imagedata.PixelBinaryData;

/**
 * /**
 * Class used to convert RGB data into binary sequences.
 * 
 * @author wpnx777
 * @version 1.0
 */
public class RGBToBinaryConverter {
  //Constructors
  /**
   * Default Constructor
   * 
   * @author wpnx777
   * @version 1.0
   */
  public RGBToBinaryConverter() {}// End Method
  
  /**
   * Parameterized constructor that will call the convertRGBToBinary() which
   * will convert the parameter ImageData objects RGB data into binary
   * sequences.
   * 
   * @param sourceImageData
   * @author wpnx777
   * @version 1.0
   */
  public RGBToBinaryConverter(ImageData sourceImageData) {
    convertRGBToBinary(sourceImageData);
  }// End Method

  /**
   * Convert the parameter ImageData objects RGB data into binary
   * sequences.
   * 
   * @param sourceImageData 
   * @author wpnx777
   * @version 1.0
   */
  public void convertRGBToBinary(ImageData sourceImageData) {
    String tmpBinaryString,binaryString = "";
    
    for(int i = 0; i < sourceImageData.getPixelRGBData().length; i++) {
      for(int j = 0; j < sourceImageData.getPixelRGBData()[i].length; j++) {
        sourceImageData.getPixelBinaryData()[i][j] = new PixelBinaryData();
        binaryString = "";
        
        for(int k = 0; k <
              sourceImageData.getPixelRGBData()[i][j].getRGB().length; k++) {
          tmpBinaryString = Integer.toBinaryString(
                              sourceImageData.getPixelRGBData()[i][j].
                                                getRGB()[k]);
          //Add padding to the binary string so that all binary strings are
          //8 characters in lenfth.
          while(tmpBinaryString.length() < 8) {
            tmpBinaryString = "0" + tmpBinaryString;
          } // End While

          binaryString = binaryString + tmpBinaryString;
        }//End For
        
        for(int l = 0; l < sourceImageData.getPixelBinaryData()[i][j].
                                             getBinarySequence().length; l++) {
          sourceImageData.getPixelBinaryData()[i][j].setBitAt(l, 
                                          ((int)(binaryString.charAt(l) - 48)));
        }//End For
      }//End For
    }//End For
  }// End Method
}// End Class