public class lab2f
{
	public static void main(String args[])
	{
		boolean a = true;
		boolean b = false;
		boolean c = true;
		boolean d = false;
		boolean e = a & b;
		boolean f = (a | b) ^ (c & d);
		boolean g = !(a | b & c) | (!d);
		System.out.println("a & b = " + e);
		System.out.println("(a | b) ^ (c & d) = " + f);
		System.out.println("~(a | b & c) | (~d) = " + g); 
	}
}
