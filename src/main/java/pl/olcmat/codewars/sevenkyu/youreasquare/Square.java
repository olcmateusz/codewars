package pl.olcmat.codewars.sevenkyu.youreasquare;

public class Square {
    public static boolean isSquare(int n) {
        if (n<0) return false;

        double root = Math.sqrt(n);
        return Math.floor(root) == root;

    }
}