import java.util.*;
class lab8c{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		char in;
		String on = new String("ON");
		String off = new String("OFF");
		String status = new String();
		do{
			status = off;
			System.out.println("Enter\n1 to turn on the AC\n0 to turn of the AC\nt to toggle\ne to exit");
			char c = scan.next().charAt(0); 
			switch(c)
			{
				case '1':
					status = on;
					System.out.println("AC is " + status);
					break;
				case '0':
					status = off;
					System.out.println("AC is " + status);
					break;
				case 't':
					if(status == off)
					{
						status = on;
						System.out.println("AC is " + status);
						break;
					}
					else
					{
						status = off;
						System.out.println("AC is " + status);
						break;
					}
				case 'e':
					return;
				default:
					System.out.println("Invalid input\nTry again\n");
					break;
			}
			System.out.print("Do you want to try again?\nY for yes and N for no: ");
			in = scan.next().charAt(0);
		}
		while(in == 'Y' || in == 'y');
	}
}
