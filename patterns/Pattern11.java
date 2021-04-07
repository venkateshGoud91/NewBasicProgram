package patterns;

public class Pattern11 {

	public static void main(String[] args) {

		/*
		         * 
	           * *
	         * * *
	       * * * *
	         * * *
	           * *
	             *  	  
		 */
		int rows=5;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<2*(rows-i)+1; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=rows-1; i++)
		{
			for(int j=1; j<=2*i; j++) 
			{
				System.out.print(" ");
			}
			for(int j=1; j<=rows-i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
