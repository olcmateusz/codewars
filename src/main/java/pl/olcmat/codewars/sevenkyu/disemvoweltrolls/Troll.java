package pl.olcmat.codewars.sevenkyu.disemvoweltrolls;

import java.util.Arrays;
import java.util.stream.Stream;

public class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}