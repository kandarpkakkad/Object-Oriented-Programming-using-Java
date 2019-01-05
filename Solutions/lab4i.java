import java.util.*;
class lab4i{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		char[] s = new char[n];
		for(int i = 0; i < n; i++)
			s[i] = scan.next().charAt(0);
		char t;
		for(int i = 0; i < n; i++)
		{
			t = s[i];
			s[i] = s[n-1-i];
			s[n-1-i] = t;
		}
		for(int i = 0; i < n; i++)
			System.out.print(s[i] + " ");
	}
}
