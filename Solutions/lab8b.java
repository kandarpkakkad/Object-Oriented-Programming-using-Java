class Simcard{
	String name = new String();
	String number = new String();
	int plan;
	String status = new String();
	
	Simcard(String n, String num, int p, String s){
		name = n;
		number = num;
		plan = p;
		status = s;
	}
	
	/*void assign(String n, String num, int p, String s){
		name = n;
		number = num;
		plan = p;
		status = s;
	}*/
	
	void display(Simcard sim1){
		System.out.println(": " + sim1.name + ", " + sim1.number + ", Rs." + sim1.plan + ", " + sim1.status);
	}
}

class lab8b{
	public static void main(String args[]){
		Simcard sim1 = new Simcard("Vodafone","9913303667",200,"Activate Data Plan");
		Simcard sim2 = new Simcard("Uninor","9913303666",80,"No Data Plan");
		/*sim1.name = "Vodafone";
		sim1.number = "9913303667";
		sim1.plan = 200;
		sim1.status = "Activate Data Plan";
		sim2.name = "Uninor";
		sim2.number = "9913303666";
		sim2.plan = 80;
		sim2.status = "No Data Plan";*/
		/*sim1.assign("Vodafone","9913303667",200,"Activate Data Plan");
		sim2.assign("Uninor","9913303666",80,"No Data Plan");*/
		System.out.print("Sim1");
		sim1.display(sim1);
		System.out.print("Sim2");
		sim2.display(sim2);
	}
}
