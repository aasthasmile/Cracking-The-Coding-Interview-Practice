package chapter1;

public class RotateMatrixby90degrees {

	public static void main(String[] args) {
		int n = 4; // Assuming 4*4 Matrix
		int initialMatrix[][] = new int[n][n];

		int k = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				initialMatrix[i][j] = k;
				k++;
				System.out.print(initialMatrix[i][j] + "\t");
			}
			System.out.println();
		}

		RotateMatrix90degressClockWise(initialMatrix, n);
		RotateMatrix90degressAntiClockWise(initialMatrix, n);
	}
	/*
	 * Given an image represented by an NxN matrix, where each pixel in the
	 * image is 4 bytes, write a method to rotate the image by 90 degrees
	 */

	private static void RotateMatrix90degressClockWise(int[][] initialMatrix, int n) {
		int rotateMatrix[][] = new int[n][n];

		System.out.println("\n\nRotated Matrix by 90 degrees ClockWise");

		int k = n;
		for (int i = 0; i < n; i++) {
			k--;
			for (int j = 0; j < n; j++) {
				rotateMatrix[j][k] = initialMatrix[i][j];
			}
		}

		printMatrix(rotateMatrix,n);
	}

	private static void RotateMatrix90degressAntiClockWise(int[][] initialMatrix, int n) {
		int rotateMatrix[][] = new int[n][n];

		System.out.println("\n\nRotated Matrix by 90 degrees Anti-ClockWise");

		int k = 0;
		for (int i = 0; i < n; i++) {
			k=n-1;
			for (int j = 0; j < n; j++) {
				rotateMatrix[k][i] = initialMatrix[i][j];
				k--;
			}
		}

		printMatrix(rotateMatrix,n);

	}
	
	private static void printMatrix(int[][] rotateMatrix,int n){
		//Matrix After Rotation
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						System.out.print(rotateMatrix[i][j] + "\t");
					}
					System.out.println();
				}
	}

}

/*Solution:
 * 
 1	2	3	4	
5	6	7	8	
9	10	11	12	
13	14	15	16	


Rotated Matrix by 90 degrees ClockWise
13	9	5	1	
14	10	6	2	
15	11	7	3	
16	12	8	4	


Rotated Matrix by 90 degrees Anti-ClockWise
4	8	12	16	
3	7	11	15	
2	6	10	14	
1	5	9	13	*/
