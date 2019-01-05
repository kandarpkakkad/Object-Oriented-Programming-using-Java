import java.util.*;
class lab3i{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long fact = 1;
		for(int i = 1; i <= n; i++)
			fact*=i;
		System.out.println("The factorial of " + n + " is: " + fact);
	}
}
