public class lab4a {
	public static void main(String args[])
	{
		for(int i = 1; i < 51; i++)
		{
			if(i%3 == 0 && i%5 != 0)
				System.out.println("Fizz");
			else if(i%3 != 0 && i%5 == 0)
				System.out.println("Bizz");
			else if(i%3 == 0 && i%5 == 0)
				System.out.println("Fizz-Bizz");
			else
				System.out.println(i);
		}
	}
}
