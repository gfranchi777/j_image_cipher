package ciphertools.imagecipher.binarytransformation;

import ciphertools.imagecipher.imagedata.*;
import ciphertools.imagecipher.utils.*;

public class XORBitwiseTransformation {
  public XORBitwiseTransformation(ImageData sourceImageData, 
                                  CoinToss coinTossResult,
                                  ImageData encryptedImageData) {
    transform(sourceImageData, coinTossResult, encryptedImageData);
  }// End Method

  public void transform(ImageData sourceImageData, CoinToss coinTossResult,
                        ImageData encryptedImageData) {
    for(int i = 0; i < sourceImageData.getPixelBinaryData().length; i++) {
      for(int j = 0; j < sourceImageData.getPixelBinaryData()[i].length; j++) {        
        for(int k = 0; k < BinarySequence.NUM_DIGITS_IN_BIN_SEQ; k++) {
          encryptedImageData.getPixelBinaryData()[i][j].setBitAt(k,
            sourceImageData.getPixelBinaryData()[i][j].getBitAt(k) ^
               coinTossResult.getCoinTossSequence()[k]);
        }//End For
      }//End For
    } // End For
  }// End Method
}// End Class
