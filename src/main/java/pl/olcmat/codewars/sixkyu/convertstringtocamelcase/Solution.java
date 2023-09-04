package pl.olcmat.codewars.sixkyu.convertstringtocamelcase;

import java.lang.StringBuilder;

/*
Complete the method/function so that it converts dash/underscore
delimited words into camel casing. The first word within the output
should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).
The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"

"The_Stealth_Warrior" gets converted to "TheStealthWarrior"

"The_Stealth-Warrior" gets converted to "TheStealthWarrior"
*/
class Solution{

  static String toCamelCase(String s){

    String[] words = s.split("[-_]");
    StringBuilder newString = new StringBuilder();

    for (int i = 0; i < words.length; i++){
      if(i != 0 && Character.isLowerCase(words[i].charAt(0))){
        String tempString = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
        newString.append(tempString);
      }else{

      newString.append(words[i]);
      }
    }
    return newString.toString();
  }
}
