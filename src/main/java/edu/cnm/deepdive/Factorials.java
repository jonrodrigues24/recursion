package edu.cnm.deepdive;

import java.math.BigInteger;

public class Factorials {

  public static BigInteger computeRecursive (BigInteger input) {

    BigInteger value = new BigInteger(String.valueOf(input));
    long inputLong = (value.longValue());
    BigInteger oneBI = new BigInteger("1");

    if (inputLong < 0) {

      throw new IllegalArgumentException();

    }

    return (inputLong == 0) ? oneBI : (input.multiply(computeRecursive(value.subtract(oneBI))));
  }

}
