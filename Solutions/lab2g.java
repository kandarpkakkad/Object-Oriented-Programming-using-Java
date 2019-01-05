public class lab2g
{
	public static void main(String args[])
	{
		int a = 10;
		int b = 8;
		int c = (++a) + (++b) + (a++);
		int d = (a++) + (++c) + (b++);
		int e = (a++);
		int f = (b++);
		System.out.println("(++a) + (++b) + (a++) = " + c);
		System.out.println("(a++) + (++c) + (b++) = " + d);
		System.out.println("(a++) = " + e);
		System.out.println("(b++) = " + f);
	}
}
