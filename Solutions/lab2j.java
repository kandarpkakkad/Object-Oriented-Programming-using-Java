import java.util.Scanner;
public class lab2j
{
	public static void main(String args[])
	{
		int a;
		float b;
		String c;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter String: ");
		c = obj.nextLine();
		System.out.println("You have entered: " + c);
		System.out.print("Enter Integer: ");
		a = obj.nextInt();
		System.out.println("You have entered: " + a);
		System.out.print("Enter Float: ");
		b = obj.nextFloat();
		System.out.println("You have entered: " + b);
	} 
}
