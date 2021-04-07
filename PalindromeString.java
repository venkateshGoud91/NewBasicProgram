
public class PalindromeString {

	public static void main(String[] args) {
		
		String txt = "madam";
		String revTxt = "";
		for(int i = txt.length()-1; i>=0; i--)
		{
			revTxt = revTxt+ txt.charAt(i);
		}
		
		if(revTxt.equalsIgnoreCase(txt))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}

}
