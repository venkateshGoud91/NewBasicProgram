package patterns;

public class Pattern6 {

	public static void main(String[] args) {

		/*
		 *           *
		 *       * * *
		 *   * * * * *
		 */
		int k=1;
		int rows =5;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=4*(rows-i); j++)
			{
				System.out.print(" ");				
			}
			for(int j=1; j<=k; j++)
			{
				System.out.print("* ");
			}
			k=k+2;
			System.out.println();
		}
		
	}

}

/*
 * rows=5;
 * ist row : 16 spaces
 * 2nd row : 12 spaces
 * 3rd row : 8 spaces
 * 4th row : 4 spaces
 * 5th row ; 0 space
 * 
 */
