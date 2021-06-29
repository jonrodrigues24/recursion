package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class FactorialsTestBigInteger {

  @Test
  void computeRecursive_nonExceptional() {
    BigInteger test = new BigInteger("0");
    long expected = Long.valueOf(computeRecursive(test));
  }
}