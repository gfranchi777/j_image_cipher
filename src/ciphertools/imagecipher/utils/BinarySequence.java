package ciphertools.imagecipher.utils;

public class BinarySequence {
  private int[] binarySequence;
  
  public static final int NUM_DIGITS_IN_BIN_SEQ = 24;
  
  public BinarySequence() {
    binarySequence = new int[NUM_DIGITS_IN_BIN_SEQ];
  }//End Method
  
  public void setBitAt(int index, int bitValue) {
    binarySequence[index] = bitValue;
  }//End Method
  
  public void setBinarySequence(int[] binarySequence) {
    this.binarySequence = binarySequence;
  }//End Method
  
  public int[] getBinarySequence() {
    return binarySequence;
  }//End Method
  
  public int length() {
    return binarySequence.length;
  }//End Method
  
  public int getBitAt(int index) {
    return binarySequence[index];
  }//End Method
  
  public String toString(){
    String binarySequenceString = "";

    for(int i = 0; i < binarySequence.length; i++) {
      binarySequenceString = binarySequenceString + binarySequence[i];
    }//End For
    return binarySequenceString;
  }//End Method
}//End Class
