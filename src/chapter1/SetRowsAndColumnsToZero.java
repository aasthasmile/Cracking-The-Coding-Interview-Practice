package chapter1;

public class SetRowsAndColumnsToZero {

	public static void main(String[] args) {
		int m = 3, n = 2;
		int initialMatrix[][] = new int[m][n];

		int k = 1;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				initialMatrix[i][j] = k % 5 == 0 ? 0 : k;
				k++;
				System.out.print(initialMatrix[i][j] + "\t");
			}
			System.out.println();
		}

		SetRowsAndColumnsToZero.SetToZero(initialMatrix, m, n);
	}
	/*
	 * Write an algorithm such that if an element in an MxN matrix is 0, its
	 * entire row and column is set to 0
	 */

	private static void SetToZero(int[][] initialMatrix, int m, int n) {

		int newMatrix[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				newMatrix[i][j] = initialMatrix[i][j];
			}
		}
		System.out.println("\n\nMatrix sets Rows and columns to Zero :");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (initialMatrix[i][j] == 0) {
					for (int k = 0; k < n; k++) {
						newMatrix[i][k] = 0;
					}
					for (int k = 0; k < m; k++) {
						newMatrix[k][j] = 0;
					}
				}

			}
		}
		printMatrix(newMatrix, m, n);
	}

	private static void printMatrix(int[][] newMatrix, int m, int n) {
		// Matrix After Rotation
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(newMatrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}


/*Solution: 
 * 1	2	
3	4	
0	6	


Matrix sets Rows and columns to Zero :
0	2	
0	4	
0	0	
*/
