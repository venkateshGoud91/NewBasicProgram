
public class AmstrongNumber {

	public static void main(String[] args) {
		//Armstrong : 370 : 3*3*3 + 7*7*7 + 0*0*0 =370
		
		int num=370;
		int total=0;
		int temp;
		int number=num;
		while(number!=0)
		{
			temp=number%10;
			total = total + temp*temp*temp;
			number=number/10;
		}
		if(total==num) {
			System.out.println("Armstrong Number");
		}
		else
		{
		System.out.println("Not an Armstrong Number");
		}
	}

}
