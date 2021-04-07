package patterns;

public class Pattern7 {

	public static void main(String[] args) {

		/*
		 * 1
		 * 2 3 
		 * 4 5 6
		 * 7 8 9 10
		 */
		
		/*
		 * 1
		 * 1 2 
		 * 1 2 3
		 * 1 2 3 4
		 * 1 2 3 4 5
		 */
		
		int rows=5;
		 int n=1;
		for(int i=1; i<=rows; i++)
		{
		//	int n=1;
			for(int j=1; j<=i; j++)
			{
				System.out.print(n + " ");
				n++;
			}
			System.out.println();
		}
		
		
		
	}

}
