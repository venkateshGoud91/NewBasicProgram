package patterns;

public class Pattern13 {

	public static void main(String[] args) {

		/*
		          *
		         * *
		        *   *
		       *     *
		      *       *
		     * * * * * *       
		  
		 */
int rows=5;
for(int i=1; i<=rows; i++)
{
	for(int j=1; j<=2*(rows-i); j++)
	{
		System.out.print(" ");
	}
	for(int j=1; j<=(2*i)-1; j++)
	{
		if(j==1 || i==rows || j==(2*i)-1)
		{
			System.out.print("* ");		
		}
		else
		{
			System.out.print("  ");
		}
	}
	System.out.println();
}
		
		
	}

}
