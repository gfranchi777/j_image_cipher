package ciphertools.imagecipher.imagedata;

import ciphertools.imagecipher.utils.BinarySequence;

public class PixelBinaryData extends BinarySequence{
  
  public PixelBinaryData() {
    
  }
  
  public PixelBinaryData(int[] binarySequence) {
    this.setBinarySequence(binarySequence);
  }
  
  public void printPixelBinaryData() {
    for(int i = 0; i < BinarySequence.NUM_DIGITS_IN_BIN_SEQ; i++) {
      System.out.print(getBitAt(i));
    }//End For
    System.out.println();
  }//End Method
}
