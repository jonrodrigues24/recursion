package edu.cnm.deepdive;

import java.util.Locale;

public class Palindromes {

  public static boolean checkRecursive(String input) {
    return input.length() <= 1
        || input.charAt(0) == input.charAt(input.length() - 1)
        && checkRecursive(input.substring(1, input.length() -1));

  }

  public static boolean checkDenormalized(String input) {
    String Punctuation = String.valueOf(input.replaceAll("\\p{Punct}", "")); //help on this
    String Formatted = String.valueOf(Punctuation.toLowerCase(Locale.ROOT).trim());

    return checkRecursive(Formatted);
  }



}
