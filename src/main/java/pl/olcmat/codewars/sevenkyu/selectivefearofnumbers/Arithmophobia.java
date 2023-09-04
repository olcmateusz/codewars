package pl.olcmat.codewars.sevenkyu.selectivefearofnumbers;

/*
I've got a crazy mental illness. I dislike numbers a lot. But it's a little complicated:
The number I'm afraid of depends on which day of the week it is...
This is a concrete description of my mental illness:

Monday --> 12

Tuesday --> numbers greater than 95

Wednesday --> 34

Thursday --> 0

Friday --> numbers divisible by 2

Saturday --> 56

Sunday --> 666 or -666

Write a function which takes a string (day of the week) and an integer (number to be tested) so it tells the doctor if I'm afraid or not. (return a boolean)
 */

public class Arithmophobia {
    static public boolean AmIAfraid(final String day, final int num) {

        boolean isAfraid = false;
        switch (day){
            case "Monday":
                isAfraid = num == 12;
                break;
            case "Tuesday":
                isAfraid = num > 95;
                break;
            case "Wednesday":
                isAfraid = num == 34;
                break;
            case "Thursday":
                isAfraid = num == 0;
                break;
            case "Friday":
                isAfraid = num % 2 == 0;
                break;
            case "Saturday":
                isAfraid = num == 56;
                break;
            case "Sunday":
                isAfraid = num == 666 || num == -666;
                break;
            default:
                System.out.println("No such day of the week!");
                break;

        }
        //Help me...
        return isAfraid;
    }
}