import java.util.*;
class lab7d{
	public static void main(String args[]){
		char c;
		do{
			Scanner scan = new Scanner(System.in);
			int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
			int[][] A = new int[10][];
			for(int row : number)
				A[row] = new int[row+1];
			for(int i : number)
				for(int j = 0; j <= i; j++)
					A[i][j] = i + j;
			for(int i : number)
			{
				for(int j = 0; j <= i; j++)
					System.out.print(A[i][j] + " ");
				System.out.println();
			}
			System.out.print("Do you want to see again?\nY for yeas and N for no: ");
			c = scan.next().charAt(0);
		}
		while(c == 'Y' || c =='y');
	}
}
