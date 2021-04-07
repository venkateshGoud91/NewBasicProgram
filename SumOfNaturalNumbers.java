
public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// 1+2+3+4+5+6+.....
		
		int num =10;
		int total=0;

for(int i=1; i<=num; i++)
{
	total =total+i;
}
System.out.println("Sum of " + num + " Natural numbers is : " + total);

	}

}
