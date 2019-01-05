import java.util.*;
class lab4g{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		char c;
		do
		{
			System.out.println("Enter two numbers: ");
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println("Enter:\n1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for Division");
			int n = scan.nextInt();
			switch(n)
			{
				case 1:
					System.out.println("Sum = " + (a+b));
					break;
				case 2:
					if(a>b)
						System.out.println("Difference = " + (a-b));
					else
						System.out.println("Difference = " + (b-a));
					break;
				case 3:
					System.out.println("Product = " + (a*b));
					break;
				case 4:
					System.out.println("Quotient = " + (a/(float)b));
					break;
				default:
					System.out.println("Invalid input");
					break;
			}
			System.out.println("Do you want to continue?\nY - yes\nN - no");
			c = scan.next().charAt(0);
			
		}
		while(c == 'Y' || c == 'y');
	}
}
