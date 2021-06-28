package edu.cnm.deepdive;

public class Factorials {


  public static long computeRecursive (int n) {

    long product = 0;

    if (n < 0) {

      throw new IllegalArgumentException();

    }

    return (n == 0) ? 1 : (n * computeRecursive(n - 1));
  }

}
