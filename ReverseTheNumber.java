
public class ReverseTheNumber {

	public static void main(String[] args) {
		
		int num= 1234;
		int revNum=0;
		while(num!=0) {
			revNum = revNum*10;
			revNum = revNum+num%10;
			num=num/10;
		}
		System.out.println(revNum);

	}

}
// 0; 4 ; 123
//40; 43; 12
//430; 432; 1
//4320; 4321; 0