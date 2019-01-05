public class lab2a
{
	public static void main(String args[])
	{
		int a;
		char l;
		for(a = 32; a < 256; a++)
		{
			l = (char)a;
			System.out.println(l + " = " + a);
		}
	}
}
