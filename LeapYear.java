import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
	
		/* Leap year
		 * 2000 is leap year but 
		 * 1900, 2100, 2200, 2300 is not leap years
		 * for every 100 years a leap year is skipped unless it is divisible by 400
		 */

		System.out.println("Enter year: ");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		scan.close();
		
		boolean leapYear = false;
		
		if(year%4==0) 
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					leapYear =true;
				}
				else
				{
					leapYear =false;
				}
			}
			else
			{
				leapYear=true;
			}
		}
			else
			{
				leapYear = false;
			}
		if(leapYear==true)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a Leap year");
		}
		
		}
}
