
public class AverageOfNumbersUsingArray {

	public static void main(String[] args) {

		int[] nums = {12, 25, 45, 35};
		double total=0;
		double avg;
		
		for(int i=0; i<=nums.length-1; i++)
		{
			total= total+ nums[i]; 
		}
		avg = total/nums.length;
		System.out.println(avg);
	}

}
