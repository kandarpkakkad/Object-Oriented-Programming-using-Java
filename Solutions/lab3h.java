import java.util.Scanner;
class lab3h{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++)
			arr[i] = scan.nextInt();
		int max = 0;
		for(int i= max; i < 3; i++)
			if(arr[max] < arr[i])
				max = i;
		System.out.println("The largest number is: " + arr[max]);
	}
}
