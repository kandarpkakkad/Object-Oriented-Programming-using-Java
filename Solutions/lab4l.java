import java.util.*;
class lab4l {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		char c;
		do
		{
			for(int i = 10; i < 1000; i++)
			{
				int k = i;
				int sum = 0, prod = 1;
				int check;
				while(k > 0)
				{
					sum += (k % 10);
					prod *= (k % 10);
					k /= 10;
				}
				if((sum + prod) == i)
					System.out.println(i);
			}
			System.out.println("Do you want to continue?\nY - yes\nN - no");
			c = scan.next().charAt(0);
		}
		while(c == 'Y' || c == 'y');
	}
}
