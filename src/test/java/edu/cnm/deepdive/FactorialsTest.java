package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class FactorialsTest {




  static final long[][] testCases = {
      {0, 1},
      {1, 1},
      {5, 120},
      {10, 3628800},
      {13, 6_227_020_800L},
  };



  @Test
  void computeRecursive_nonExceptional() {
    for (long[] testCase : testCases) {
      int n = (int) testCase[0];
      BigInteger expected = BigInteger.valueOf(testCase[1]);
      BigInteger actual = Factorials.computeRecursive(n);
      assertEquals(expected, actual);
    }
  }

  @Test
  void computeRecursive_exceptional() {
    assertThrows(IllegalArgumentException.class, new Executable() {
      @Override
      public void execute() throws Throwable {
        Factorials.computeRecursive(-1);
      }
    });
  }


}