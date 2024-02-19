package pl.olcmat.codewars.sevenkyu.reversewords;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

Examples
"This is an example!" ==> "sihT si na !elpmaxe"
"double  spaces"      ==> "elbuod  secaps"
 */
public class Kata
{
  public static String reverseWords(final String original)
  {
    if (original.trim().isEmpty()) return original;
    return Arrays.stream(original.split(" "))
            .map(word -> new StringBuilder(word).reverse())
            .collect(Collectors.joining(" "));
  }
}