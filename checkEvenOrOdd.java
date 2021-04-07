import java.util.Scanner;

public class checkEvenOrOdd {

	public static void main(String[] args) {
	
		System.out.println("Enter number");
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		if(n%2==0)
		{
			System.out.println("Is a Even number");
		}
		else
		{
			System.out.println("Is Odd Number");
		}
		
	}

}
