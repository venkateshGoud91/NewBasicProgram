package patterns;

public class Pattern10 {

	public static void main(String[] args) {

		/*
		 *
		 * *
		 * * *
		 * * * *
		 * * * * *
		 * * * *
		 * * * 
		 * *
		 * 
		  
		 */
		
		int rows =5;
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for( int i=0; i<=rows-1; i++)
		{
			for(int j=1; j<rows-i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
