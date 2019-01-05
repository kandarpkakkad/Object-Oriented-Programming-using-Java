import java.util.*;
public class lab4c {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		int max = 0;
		int min = 0;
		int[] a = new int[5];
		a[0] = 6521;
		a[1] = 51;
		a[2] = 5465;
		a[3] = 698165;
		a[4] = 225;
		for(int i = max+1; i < 5; i++)
			if(a[max] < a[i])
				max = i;
		for(int i = min+1; i < 5; i++)
			if(a[min] > a[i])
				min = i;
		System.out.println("Largest number: " + a[max] + "\nSmallest number: " + a[min]);
	}
}
