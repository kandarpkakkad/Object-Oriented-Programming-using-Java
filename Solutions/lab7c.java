import java.util.*;
class Time{
	int hr,min,sec;
	Time(){
		hr = 0;
		min = 0;
		sec = 0;
	}
	Time(int h, int m, int s){
		hr = h;
		min = m;
		sec = s;
	}
	Time add(Time t1, Time t2){
		Time t3 = new Time();
		t3.hr = t1.hr + t2.hr;
		t3.min = t1.min + t2.min;
		t3.sec = t1.sec + t2.sec;
		if(t3.sec >= 60)
		{
			t3.min += (t3.sec/60);
			t3.sec %= 60;
			
		}
		if(t3.min >= 60)
			t3.hr += (t3.min/60);
			t3.min %= 60;
		return t3;
	}
}
class lab7c{
	public static void main(String args[]){
		char c;
		do{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter hours minutes and seconds of 1st time: ");
			int h1 = scan.nextInt();
			int m1 = scan.nextInt();
			int s1 = scan.nextInt();
			System.out.println("Enter hours minutes and seconds of 2nd time: ");
			int h2 = scan.nextInt();
			int m2 = scan.nextInt();
			int s2 = scan.nextInt();
			Time t1 = new Time(h1,m1,s1);
			Time t2 = new Time(h2,m2,s2);
			Time t3 = new Time();
			t3 = t3.add(t1,t2);
			System.out.println("Addition of time is\nHours: " + t3.hr + "\nMinutes: " + t3.min + "\nSeconds: " + t3.sec + "\n");
			System.out.print("Do you want to try it again?\nY for yes and N for no: ");
			c = scan.next().charAt(0);
		}
		while(c == 'Y' || c == 'y');
	}
}
