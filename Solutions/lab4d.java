import java.util.*;
class lab4d{
	public static void Max(int arr[]){
		int max = 0;
		for(int i = max; i < arr.length; i++)
			if(arr[max] < arr[i])
				max = i;
		System.out.println("Largest: " + arr[max]);
	}
	public static void Min(int arr[]){
		int min = 0;	
		for(int i = min; i < arr.length; i++)
			if(arr[min] > arr[i])
				min = i;
		System.out.println("Smallest: " + arr[min]);
	}
	public static void main(String a[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = scan.nextInt();
		Max(arr);
		Min(arr);
	}
}
