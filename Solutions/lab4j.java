import java.util.*;
class lab4j {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		char c;
		do
		{
			int n = scan.nextInt();
			int[] a = new int[4];
			int ctr = 0;
			int temp = n;
			while(temp > 0)
			{
				temp /= 10;
				ctr++;
			}
			if(ctr == 4)
			{
				int i = 3;
				while(n>0 && i>=0)
				{
					a[i] = n % 10;
					n /= 10;
					i--; 
				}
				for(int j = 0; j < 4; j++)
					System.out.println(a[j]);
			}
			else
				System.out.println("Wrong Input");
			System.out.println("Do you want to continue?\nY - yes\nN - no");
			c = scan.next().charAt(0);
		}
		while(c == 'Y' || c == 'y');
	}
}
