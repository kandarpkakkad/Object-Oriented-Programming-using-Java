import java.util.*;
class lab3e{
	public static void main(String args[]){
		float w,h;
		float bmi;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your Weight in Pounds(lbs): ");
		w = scan.nextFloat();
		System.out.print("Enter your Height in Inches: ");
		h = scan.nextFloat();
		if(w == 0 || h == 0)
			System.out.println("Enter valid number");
		else
		{
			bmi = (w/(h*h))*703;
			System.out.println(bmi);
			if(bmi < 18.5)
				System.out.println("You are under weighted.");
			else if(bmi >= 18.5 && bmi <= 24.9)
				System.out.println("You are normal weighted.");
			else if(bmi > 24.9 && bmi < 29)
				System.out.println("You are over weighted.");
			else if(bmi >= 29)
				System.out.println("You are obessed.");
		}
	}
}
