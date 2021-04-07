import java.util.Scanner;

public class SumOfElementsOfArrayWhwnUserEntersInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter elements");
		int[] arr =new int[5];
		int sum=0;
		
		for(int i=0; i<5; i++)
		{
			arr[i]=scanner.nextInt();
		}
		for(int ele : arr) {
			sum = sum+ele;
		}
		System.out.println(sum);
	}

}
