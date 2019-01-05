import java.util.*;
class Complex{
	int a1,b1,a2,b2,c1;
	Complex(int a, int A){
		a1 = a;
		a2 = A;
	}
	Complex add(Complex obj){
		 obj.a1 = obj.a1 + obj.a2;
		 return obj;
	}
}
class lab5a{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		char c;
		do{
			int a1,a2,b1,b2;
			a1 = scan.nextInt();
			a2 = scan.nextInt();
			b1 = scan.nextInt();
			b2 = scan.nextInt();
			Complex complex1 = new Complex(a1,a2);
			Complex complex2 = new Complex(b1,b2);
			complex1 = complex1.add(complex1); 
			complex2 = complex2.add(complex2);
			System.out.println("Sum of " + a1 + " + i" + b1 + " and " + a2 + " + i" + b2 + " is: " + complex1.a1 + " + i" + complex2.a1);
			System.out.println("Do you want to continue?\nY for yes and N for no.");
			c = scan.next().charAt(0);
		}
		while(c == 'Y' || c == 'y');
	}
}
