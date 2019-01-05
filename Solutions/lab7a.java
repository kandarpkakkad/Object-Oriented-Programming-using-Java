import java.util.*;
class movieMagic{
	int year;
	String title = new String();
	float rate;
	void accept(int y, String t, float r){
		year = y;
		title = t;
		if(r>=0 && r<=5)
			rate = r;
		else
		{
			rate = r;
			System.out.println("Enter valid rating.");
		}
	}
	void display(){
		System.out.print("Name: " + title + "\nRating: ");
		if(rate >=0 && rate <= 2)
			System.out.println("Flop");
		else if(rate > 2 && rate < 3.5)
			System.out.println("Semi Hit");
		else if(rate > 3.4 && rate < 4.6)
			System.out.println("Hit");
		else if(rate <=5)
			System.out.println("Super Hit");
	}
}
class lab7a{
	public static void main(String args[]){
		char c;
		do{
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter title of the movie: ");
			String t = scan.nextLine();
			System.out.print("Enter releasing year of the movie: ");
			int y = scan.nextInt();
			System.out.print("Enter rating of the movie: ");
			float r = scan.nextFloat();
			movieMagic m = new movieMagic();
			m.accept(y,t,r);
			m.display();
			System.out.print("Do you want to see again?\nY for yes and N for no: ");
			c = scan.next().charAt(0);
		}
		while(c == 'y' || c == 'Y');
	} 
}
