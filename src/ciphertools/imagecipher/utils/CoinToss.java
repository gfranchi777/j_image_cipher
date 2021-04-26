package ciphertools.imagecipher.utils;

import java.util.Random;

/**
 * Simulate a coin toss
 * 
 * @author wpnx777
 */
public class CoinToss {
  private Random randomGenerator  = new Random();
  private int[]  coinTossSequence = new int[
                                      BinarySequence.NUM_DIGITS_IN_BIN_SEQ];
  
  /**
   * Default Constructor
   */
  public CoinToss() {}// End Method
  
  /**
   * Parameterized constructor which allows us to set the number
   * of coin tosses we want to sequence
   * 
   * @param sequenceSize 
   */
  public CoinToss(int sequenceSize) {
    generateRandomSequence(sequenceSize);
  }// End Method

  public int[] getCoinTossSequence() {
    return coinTossSequence;
  }// End Method

  public void generateRandomSequence(int sequenceSize) {
    for(int i = 0; i < sequenceSize; i++) {
      coinTossSequence[i] = randomGenerator.nextInt(2);
    } // End For
  }// End Method

  public void printSequence() {
    for(int i = 0; i < coinTossSequence.length; i++) {
      System.out.print(coinTossSequence[i]);
    } // End For
    System.out.println();
  }// End Method

  public void printSequenceDetails() {
    int numHeads = 0;
    int numTails = 0;
    
    for(int i = 0; i < coinTossSequence.length; i++) {
      if(coinTossSequence[i] == 0) {
        numHeads++;
      } else {
        numTails++;
      } // End If
    } // End For

    System.out.println("Coin Toss Sequence Size: " + coinTossSequence.length);
    System.out.println();
    
    for(int i = 0; i < coinTossSequence.length; i++) {
      if(i < 10) {
        System.out.println("Coin Toss 0" + i + ": " + coinTossSequence[i]);
      } else {
        System.out.println("Coin Toss " + i + ": " + coinTossSequence[i]);
      } // End If
    } // End For
    
    System.out.println();
    System.out.println("Number Of Heads (0): " + numHeads);
    System.out.println("Number Of Tails (1): " + numTails);
  }// End Method
}// End Class