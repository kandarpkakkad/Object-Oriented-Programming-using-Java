import java.util.*;
class lab3f{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ctr = 0;
		if(n == 0 || n == 1)
			System.out.println("Neither prime nor composite");
		else
		{
			for(int i = 2; i < n/2; i++)
			{
				if(n%i==0)
					ctr++;
			}
			if(ctr > 0)
				System.out.println("The number is not prime.");
			else
				System.out.println("The number is prime.");
		}		
	}
}
