import java.util.*;
class lab7b{
	public static void main(String args[]){
		char c;
		do{
			Scanner scan = new Scanner(System.in);
			String name = new String("Kandarp Bhavesh Kakkad");
			System.out.println("Length: " + name.length());
			int ctr = 0;
			int[] l = new int[name.length()];
			for(int i = 0; i < name.length(); i++)
				if(name.charAt(i) == 'a')
				{
					ctr++;
					l[i]++;
				}
			System.out.println("Number of a's in String is/are: " + ctr);
			System.out.print("Indexes are: ");
			for(int i = 0; i < name.length(); i++)
				if(l[i] > 0)
					System.out.print(i + " ");
			System.out.print("\n");
			System.out.print("Do you want to see again?\nY for yes and N for no: ");
			c = scan.next().charAt(0);
		}
		while(c == 'Y' || c == 'y');
	}
}
