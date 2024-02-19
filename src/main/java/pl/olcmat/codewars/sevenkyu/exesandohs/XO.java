package pl.olcmat.codewars.sevenkyu.exesandohs;


/*
Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

Examples input/output:

XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false
 */
public class XO {

public static boolean getXO (String str) {

    int countX = 0;
    int countO = 0;

    String lowerCaseString = str.toLowerCase();

        for(int i=0; i<lowerCaseString.length();i++){
            char c = lowerCaseString.charAt(i);

            if (c == 'x') countX++;
            if (c == 'o') countO++;
        }

    return countX == countO;
    }
}