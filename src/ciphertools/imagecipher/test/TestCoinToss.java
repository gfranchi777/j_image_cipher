package ciphertools.imagecipher.test;

import ciphertools.imagecipher.utils.*;

public class TestCoinToss {
  public static void main(String[] args) {
    CoinToss coinToss = new CoinToss(BinarySequence.NUM_DIGITS_IN_BIN_SEQ);
    coinToss.printSequenceDetails();
  }// End Main Method
}// End Class