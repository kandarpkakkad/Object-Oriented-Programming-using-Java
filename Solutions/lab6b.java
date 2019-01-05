import java.util.*;
class lab6b{
	public static void main(String args[]){
		 char c;
		 do{
		 	Scanner scan = new Scanner(System.in);
		 	String s = "Nirma University";
		 	String t = s;
		 	StringBuilder sb = new StringBuilder(t);
		 	t = sb.reverse().toString();
		 	String u = s;
		 	u = u.replaceAll("Ni", "Ab");
		 	System.out.println("Reverse: " + t);
		 	System.out.println("Replacing \"Ni\" with \"Ab\": " + u);
		 	System.out.println("Is \"rma\" is the String? " + s.regionMatches(2 , "rma" , 0 , 3));
		 	System.out.println("Is \"Uni\" is the String? " + s.regionMatches(6 , "Uni" , 0 , 3));
		 	System.out.println("Do you want to see again?\nY for yes and N for no");
		 	c = scan.next().charAt(0);
		 }
		 while(c == 'Y' || c == 'y');
	}
}
