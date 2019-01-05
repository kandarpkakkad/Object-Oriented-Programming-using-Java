import java.io.*; 
import java.util.Scanner; 
class cdr1 implements Serializable { 
	int A_number; 
	int B_number; 
	int duration; 
	int charge; 
	cdr1(int a,int b,int c) { 
		A_number=a; 
		B_number=b; 
		duration=c; 
	} 
	public void calcCharge() { 
		charge=1*duration; 
	} 
	public int getCharge() { return charge; } 
	public void display() { 
		System.out.println("Anumber="+A_number); 
		System.out.println("Bnumber="+B_number); 
		System.out.println("Duration="+duration); 
		System.out.println("Calulated Charge="+charge); 
	} 
} 
public class lab10b { 
	public static void main(String [] args) { 
		int aNum,bNum,dur; 
		Scanner dis=new Scanner(System.in); 
		DataOutputStream dos; 
		try { 
			System.out.print("Enter First Number:"); 
			aNum=dis.nextInt(); 
			System.out.print("Enter Second Number:"); 
			bNum=dis.nextInt(); 
			System.out.print("Enter Duration:"); 
			dur=dis.nextInt(); 
			dos=new DataOutputStream(new FileOutputStream("calculatedCharge.txt")); 
			cdr1 c=new cdr1(aNum,bNum,dur); 
			c.calcCharge(); 
			c.display(); 
			dos.writeBytes("Calulated Charge="+c.getCharge()); 
			dos.close(); 
			ObjectOutputStream oos=new ObjectOutputStream( new FileOutputStream("rated_cdr.txt")); 
			oos.writeObject(c); oos.close(); 
		} 
		catch(Exception e) { 
			System.out.println(e); 
		} 
		try { 
			cdr1 c1; 
			ObjectInputStream ois=new 
			ObjectInputStream( new FileInputStream("rated_cdr.txt")); 
			System.out.println("\nReading object from file"); 
			c1=(cdr1) ois.readObject(); 
			c1.display(); 
			ois.close(); 
		} 
		catch(Exception e) { 
			System.out.println(e); 
		} 
	}
}
