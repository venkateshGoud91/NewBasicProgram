
public class ConvertCharArrayToString {

	public static void main(String[] args) {

		char[] arr = {'v', 'e', 'n', 'k', 'a', 't', 'e', 's', 'h'};
		String str= new String(arr);
		System.out.println(str);
		
		//or
		
		String str1= String.valueOf(arr);
		System.out.println(str1);
	}

}
