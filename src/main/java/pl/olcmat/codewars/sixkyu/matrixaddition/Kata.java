package pl.olcmat.codewars.sixkyu.matrixaddition;

public class Kata {
	public static int[][] matrixAddition(int[][] a, int[][] b) {

		int [][] finalMatrix = new int[a.length][b.length];
		for (int i = 0; i< a.length;i++){
			for (int j = 0; j < a.length; j++){
				finalMatrix[i][j] = a[i][j] + b[i][j];
			}
		}
		return finalMatrix;
	}
}