package pl.olcmat.codewars.eightkyu.evennumbers;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenNumbers {
  /*
  public static int[] divisibleBy(int[] numbers, int divider) {
    ArrayList<Integer> divisibleNumbersList= new ArrayList<>();
    for(int number : numbers){
      if (number%divider ==0) divisibleNumbersList.add(number);
    }
    int[] divisibleNumbersArray = new int[divisibleNumbersList.size()];
    for (int i = 0; i < divisibleNumbersList.size(); i++) {
      divisibleNumbersArray[i] = divisibleNumbersList.get(i);
    }

    return divisibleNumbersArray;
  }

   */
  public static int[] divisibleBy(int[] numbers, int divider) {

    return Arrays.stream(numbers)
            .filter(number -> (number %2) ==0)
            .toArray();
  }

}