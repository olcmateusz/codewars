package pl.olcmat.codewars.sevenkyu.last;

import java.util.Arrays;
import java.util.List;

//Find the last element of the given argument(s).
public class Solution {
    public static <T> T last(final List<T> list) {
        return list.get(list.size() -1);
    }
    public static char last(final String string) {
        return string.charAt(string.length() -1);
    }
    public static <T> T last(final T... list) {
        return Arrays.stream(list).reduce((first,second) -> second).orElse(null);
    }
}