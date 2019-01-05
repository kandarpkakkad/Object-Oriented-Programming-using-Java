import java.util.*;
class Student{
	String fname = new String();
	String lname = new String();
	String rollno = new String();
	int date, month, year;
	String email = new String();
	
	private static final Scanner scan = new Scanner(System.in);
	
	Student(){
		fname = "";
		lname = "";
		rollno = "";
		date = 0;
		month = 0;
		year = 0;
		email = "";
	}
	
	void info_input(){
		while(true)
		{
			System.out.print("Enter your first name: "); 
			fname = scan.next();
			if(fname == "" || fname == "\n" || fname == " " || fname == "\t")
				System.out.println("Enter valid First Name");
			else
				break;
		}
		while(true)
		{
			System.out.print("Enter your last name: "); 
			lname = scan.next();
			if(lname == "" || lname == "\n" || lname == " " || lname == "\t")
				System.out.println("Enter valid Last Name");
			else
				break;
		}
		while(true)
		{
			System.out.print("Enter your roll number: ");
			rollno = scan.next();
			if(rollno == "")
				System.out.println("Enter valid Roll Number");
			else
				break;
		}
		while(true)
		{
			System.out.print("Enter your birthdate(dd mm yyyy): ");
			date = scan.nextInt();
			month = scan.nextInt();
			year = scan.nextInt();
			if(date > 0 && date <= 31 && month > 0 && month <= 12)
				break;
			else
				System.out.println("Enter valid Birthdate");
		}
		while(true)
		{
			System.out.print("Enter your email id: ");
			email = scan.next();
			int ctr = 0;
			for(int i = 0; i < email.length(); i++)
				if(email.charAt(i) == '@')
					ctr++;
			if(ctr == 1)
				break;
			else
				System.out.println("Enter valid Email ID");	
		}
		System.out.println("\n");
	}
	
	void info_display(){
		System.out.println("Name:                    " + fname + " " + lname);
		System.out.println("Roll Number:             " + rollno);
		System.out.printf("Birthdate:               %02d/%02d/%04d\n",date,month,year);
		System.out.println("Email ID:                " + email);
	}
}

class Exam extends Student{
	int maths_marks = 0, english_marks = 0, ss_marks = 0, gujarati_marks = 0, sanskrit_marks = 0, science_marks = 0, computer_marks = 0;
	
	private static final Scanner in = new Scanner(System.in);
	
	void marks_input(){
		while(true)
		{
			System.out.print("Enter your Maths marks: ");
			maths_marks = in.nextInt();
			if(maths_marks > -1 && maths_marks <=100)
				break;
			else
				System.out.println("Marks Should be between 0 and 100");
		}
		while(true)
		{
			System.out.print("Enter your English marks: ");
			english_marks = in.nextInt();
			if(english_marks > -1 && english_marks <=100)
				break;
			else
				System.out.println("Marks Should be between 0 and 100");
		}
		while(true)
		{
			System.out.print("Enter your SS marks: ");
			ss_marks = in.nextInt();
			if(ss_marks > -1 && ss_marks <=100)
				break;
			else
				System.out.println("Marks Should be between 0 and 100");
		}
		while(true)
		{
			System.out.print("Enter your Gujarati marks: ");
			gujarati_marks = in.nextInt();
			if(gujarati_marks > -1 && gujarati_marks <=100)
				break;
			else
				System.out.println("Marks Should be between 0 and 100");
		}
		while(true)
		{
			System.out.print("Enter your Sanskrit marks: ");
			sanskrit_marks = in.nextInt();
			if(sanskrit_marks > -1 && sanskrit_marks <=100)
				break;
			else
				System.out.println("Marks Should be between 0 and 100");
		}
		while(true)
		{
			System.out.print("Enter your Science marks: ");
			science_marks = in.nextInt();
			if(science_marks > -1 && science_marks <=100)
				break;
			else
				System.out.println("Marks Should be between 0 and 100");
		}
		while(true)
		{
			System.out.print("Enter your Computer marks: ");
			computer_marks = in.nextInt();
			if(computer_marks > -1 && computer_marks <=100)
				break;
			else
				System.out.println("Marks Should be between 0 and 100");
		}
	}
	
	void marks_display(int i){
		switch(i)
		{
			case 1:
				System.out.println("Your Maths marks are: " + maths_marks);
				break;
			case 2:
				System.out.println("Your English marks are: " + english_marks);
				break;
			case 3:
				System.out.println("Your SS marks are: " + ss_marks);
				break;
			case 4:
				System.out.println("Your Gujarati marks are: " + gujarati_marks);
				break;
			case 5:
				System.out.println("Your Sanskrit marks are: " + sanskrit_marks);
				break;
			case 6:
				System.out.println("Your Science marks are: " + science_marks);
				break;
			case 7:
				System.out.println("Your Computer marks are: " + computer_marks);
				break;
			default:
				System.out.println("Your Maths marks are:    " + maths_marks);
				System.out.println("Your English marks are:  " + english_marks);
				System.out.println("Your SS marks are:       " + ss_marks);
				System.out.println("Your Gujarati marks are: " + gujarati_marks);
				System.out.println("Your Sanskrit marks are: " + sanskrit_marks);
				System.out.println("Your Science marks are:  " + science_marks);
				System.out.println("Your Computer marks are: " + computer_marks);
				break;
		}
	}
	void marks_display(){
		System.out.println("Your Maths marks are:    " + maths_marks);
		System.out.println("Your English marks are:  " + english_marks);
		System.out.println("Your SS marks are:       " + ss_marks);
		System.out.println("Your Gujarati marks are: " + gujarati_marks);
		System.out.println("Your Sanskrit marks are: " + sanskrit_marks);
		System.out.println("Your Science marks are:  " + science_marks);
		System.out.println("Your Computer marks are: " + computer_marks);
	}
}

class Result extends Exam{
	int total_marks = 0;
	float avg = 0f;
	
	int total(Exam e){
		total_marks = e.maths_marks + e.english_marks + e.ss_marks + e.gujarati_marks + e.sanskrit_marks + e.science_marks + e.computer_marks;
		return total_marks;
	}
	
	float average(int tot){
		avg = ((float)tot)/7;
		return avg;
	}
	
	void result_display(int t, float a){
		System.out.println("Your Total marks are:    " + t);
		System.out.println("Your Average is:         " + a);	
	}
}

class lab8a{

	private static final Scanner obj = new Scanner(System.in);

	public static void main(String args[]){
		Student s1 = new Student();
		Exam e1 = new Exam();
		Result r1 = new Result();
		System.out.println("   +++=== Welcome To Evaluation ===+++   \n");
		char c;
		do{
			s1.info_input();
			e1.marks_input();
			int total1 = r1.total(e1);
			float avg1 = r1.average(total1);
			int main_choice,sub_choice;
			System.out.println("\nChoose from the following:\n\n1. View Student Information\n2. View Marks\n3. View Result\n4. View All\n5. Exit");
			main_choice = obj.nextInt();
			switch(main_choice)
			{
				case 1:
					s1.info_display();
					break;
				case 2:
					System.out.println("\nEnter your choice: \n\n1. Maths\n2. English\n3. SS\n4. Gujarati\n5. Sanskrit\n6. Science\n7. Computer\n8. All");
					sub_choice = obj.nextInt();
					e1.marks_display(sub_choice);
					break;
				case 3:
					r1.result_display(total1,avg1);
					break;
				case 4:
					s1.info_display();
					e1.marks_display();
					r1.result_display(total1,avg1);
					break;
				default:
					return;
			}
			System.out.print("Do you want to continue?\nY for yes and N for no: ");
			c = obj.next().charAt(0);
		}
		while(c == 'Y' || c == 'y');
	}	
}
