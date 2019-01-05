import java.util.*;
class lab3a{
	public static void main(String args[]){
		int d,m,y;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Birthdate: ");
		d = scan.nextInt();
		m = scan.nextInt();
		y = scan.nextInt();
		if(d == 0 || m == 0)
			System.out.println("Enter valid number",d,m,y);
		else	
			System.out.printf("Your Birthdate is: %02d/%02d/%04d \n",d,m,y);	
	}
}
