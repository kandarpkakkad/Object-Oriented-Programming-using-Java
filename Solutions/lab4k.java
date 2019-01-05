import java.util.*;
class lab4k {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		char c;
		do
		{
			long n = scan.nextInt();
			long k = n;
			int ctr = 0;
			while(k > 0)
			{
				k /= 10;
				ctr++;
			}
			int sum = 0;
			while(n > 0)
			{
				sum += (n%10);
				n /= 10;
			}
			System.out.println(sum);
			System.out.println("Do you want to continue?\nY - yes\nN - no");
			c = scan.next().charAt(0);
		}
		while(c == 'Y' || c == 'y');
	}
}
