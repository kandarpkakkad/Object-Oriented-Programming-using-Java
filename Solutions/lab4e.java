import java.util.*;
class lab4e{
	public static void main(String a[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = scan.nextInt();
		for(int i = 0; i < n; i++)
			if(arr[i]%2 == 0)
				System.out.println("Even: " + arr[i]);
			else
				System.out.println("Odd: " + arr[i]);
	}
}
