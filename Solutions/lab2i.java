import java.util.Scanner;
public class lab2i
{
	public static void main(String args[])
	{
		int date;
		int month;
		int year;
		Scanner obj = new Scanner(System.in);
		date = obj.nextInt();
		month = obj.nextInt();
		year = obj.nextInt();
		System.out.println("Your birthday is " + date + "/" + month + "/" + year);
	}
}
