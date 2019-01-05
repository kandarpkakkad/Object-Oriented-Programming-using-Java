import java.util.*;
class lab6a{
	public static void main(String args[]){
		char c;
		do{
			Scanner scan = new Scanner(System.in);
			String s = scan.nextLine();
			s = s.toLowerCase();
			int vowel = 0, consonant = 0, digits = 0;
			for(int i = 0; i < s.length(); i++)
			{
				char t = s.charAt(i);
				switch(t)
				{
					case 'a': vowel++; break;
					case 'b': consonant++; break;
					case 'c': consonant++; break;
					case 'd': consonant++; break;
					case 'e': vowel++; break;
					case 'f': consonant++; break;
					case 'g': consonant++; break;
					case 'h': consonant++; break;
					case 'i': vowel++; break;
					case 'j': consonant++; break;
					case 'k': consonant++; break;
					case 'l': consonant++; break;
					case 'm': consonant++; break;
					case 'n': consonant++; break;
					case 'o': vowel++; break;
					case 'p': consonant++; break;
					case 'q': consonant++; break;
					case 'r': consonant++; break;
					case 's': consonant++; break;
					case 't': consonant++; break;
					case 'u': vowel++; break;
					case 'v': consonant++; break;
					case 'w': consonant++; break;
					case 'x': consonant++; break;
					case 'y': consonant++; break;
					case 'z': consonant++; break;
					case '0': digits++; break;
					case '1': digits++; break;
					case '2': digits++; break;
					case '3': digits++; break;
					case '4': digits++; break; 
					case '5': digits++; break;
					case '6': digits++; break;
					case '7': digits++; break;
					case '8': digits++; break;
					case '9': digits++; break;
				}
			}
			System.out.println("Vowel: " + vowel + "\nConsonant: " + consonant + "\nDigits: " + digits);
			System.out.println("Do you want to continue?\nY for yes and N for no");
			c = scan.next().charAt(0);
		}
		while(c == 'Y' || c == 'y');
	}
}
