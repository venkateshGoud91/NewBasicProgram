
public class CountVowelsAndConsonants {

	public static void main(String[] args) {

		String txt = "Venu";
		int vowelCount =0;
		int conCount = 0;
		
		txt = txt.toLowerCase();
		for(int i=0; i<=txt.length()-1; i++)
		{
			char ch = txt.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				vowelCount++;
			}
			else
			{
				conCount++;
			}
		}
		
		System.out.println("Vomels Count : " + vowelCount);
		System.err.println("Consonant count is : " + conCount);
	}

}
