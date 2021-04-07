import java.util.Scanner;

public class CheckIfNumberIsPositiveOrNegative {

	public static void main(String[] args) {

	System.out.println("Enter Number");
	Scanner scanner = new Scanner(System.in);
	int num= scanner.nextInt();
		
	if(num>0)
	{
		System.out.println("Postive");
	}
	else if(num<0)
	{
		System.out.println("Neagtive");
	}
	else
	{
		System.out.println("Neither negative nor positive");
	}
	}

}
