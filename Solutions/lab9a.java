import java.util.*;
abstract class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	abstract void PersonDetails();
}

class Employee extends Person{
	int EmpId;
	Employee(String name, int age, int EmpId){
		super(name, age);
		this.EmpId = EmpId;
	}
	void PersonDetails(){
		System.out.println("Name: " + name + "\nAge: " + age + "\nEmployee ID: " + EmpId);
	}
}

class Student1 extends Person{
	int StuId;
	Student(String name, int age, int StuId){
		super(name, age);
		this.StuId = StuId;
	}
	void PersonDetails(){
		System.out.println("Name: " + name + "\nAge: " + age + "\nStudent ID: " + StuId);
	}
}

class lab9a{
	private static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		char c;
		do{
			String name = scan.nextLine();
			int age = scan.nextInt();
			int EmpId = scan.nextInt();
			int StuId = scan.nextInt();
			Person p1;
			Person p2;
			Student1 s1 = new Student1(name, age, StuId);
			Employee e1 = new Employee(name, age, EmpId);
			p1 = s1;
			p2 = e1;
			p1.PersonDetails();
			p2.PersonDetails();
			System.out.println("Do you want to continue?\nY for yes and N for no: ");
			c = scan.next().charAt(0);
			
		}
		while(c == 'Y' || c == 'y');
	}
}
