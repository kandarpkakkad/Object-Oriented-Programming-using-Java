import java.util.*;
class lab4h{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		char[] s = new char[10];
		for(int i = 0; i < 10; i++)
			s[i] = scan.next().charAt(0);
		System.out.println("Before");
		for(int i = 0; i < 10; i++)
			System.out.print(s[i]);
		char[] t = new char[10];
		for(int i = 0; i < 10; i++)
			t[i] = s[9-i];
		System.out.println("\nAfter");
		for(int i = 0; i < 10; i++)
			System.out.print(t[i]);
		System.out.println("\n");
	}
}
