
public class AddTwoMatrixUsingMultiDimensionalArray {

	public static void main(String[] args) {
	
		int rows= 2;
		int columns = 3;
		int[][] matrix1 = { {1, 5, 3}, {3, 5, 6}};
		int[][] matrix2 = { {4, 5, 6}, {7, 2, 8}};

		int[][] sum = new int[rows][columns];
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				sum[i][j] = matrix1[i][j]+matrix2[i][j];
			}
		}
		//Displaying the sum matrix
		System.out.println("Sum of the matrixs is: ");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++) {
				System.out.print(sum[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
