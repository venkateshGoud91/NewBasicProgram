import java.util.Scanner;

public class CalculatorUsingSwitch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter first num :");
		int num1= scan.nextInt();
		
		System.out.println("enter second num :");
		int num2 = scan.nextInt();
		
		System.out.println("enter operator (+, -, *, /)");
		char operator = scan.next().charAt(0);
		
		switch(operator)
		{
		case '+':
			System.out.println(num1+num2 + " Sum");
			break;
		case '-':
			System.out.println(num1-num2 +" Sub");
			break;
		case '*':
			System.out.println(num1*num2 +" Multiply");
			break;
		case '/':
			System.out.println(num1/num2 + " division");
			break;
		default :
			System.out.println("Enter correct operator");
		}
		
	}

}
