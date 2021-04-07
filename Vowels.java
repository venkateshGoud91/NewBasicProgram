import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Charector");
		char ch = scanner.next().charAt(0);
		boolean isVowel = false;
		scanner.close();
		
		switch(ch)
		{
		case 'a': isVowel=true;
		break;
		case 'e' : isVowel =true;
		break;
		case 'i' : isVowel=true;
		break;
		case 'o' : isVowel=true;
		break;
		case 'u' : isVowel=true;
		break;
		default: isVowel=false;
		}
		if(isVowel==true) {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Not a Vowel");
		}
	}

}
