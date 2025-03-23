package cloudsek;
 class employee{
	int id;
	String Name;
	int Salary;

employee(int id,String Name,int Salary){
	this.id=id;
	this.Name=Name;
	this.Salary=Salary;}
	//displayDetails();}
	
	
void displayDetails() {
	System.out.println("Employee id is "+id);
	System.out.println("Employee name is "+Name);
	System.out.println("Employee salary is "+Salary);
	
	System.out.println("\n");
}
}

public class person{
	public static void main(String args[]) {
		employee p1=new employee(12,"Amar",50000);
		employee p2=new employee(14,"jesi",60000);
		employee p3=new employee(15,"kumar",90000);
		
		p1.displayDetails();
		p2.displayDetails();
		p3.displayDetails();
		
		
	}
}