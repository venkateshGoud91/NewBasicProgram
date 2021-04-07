package patterns;

public class Pattern4 {

	public static void main(String[] args) {

		/*
		   
		   *
		   * * *
		   * * * * *
		   * * * * * * *
		   * * * * * * * * *
		 */

		int rows =5;
		int k=1;
		for(int i=0; i<rows; i++)
		{
			for(int j=1; j<=(2*i)+1; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
