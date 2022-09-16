package basicofjava;

public class Employee {
	 String empname;
	 int empid;
	 int sal;
	 String designation;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		emp1.init("Tasmiya", 1,30000,"Abc");
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.init("Shaviz", 2,40000, "Pqr");
		emp2.display();
	}
	
	void init(String empname_temp, int empid_temp, int sal_temp,String designation_temp)
	{
		empname= empname_temp;
		empid= empid_temp;
		sal=sal_temp;
		designation=designation_temp;
	}
	
	void display()
	{
		System.out.println("Employee name is " + empname);
		System.out.println("Employee id is " + empid);
		System.out.println("Employee sal is " + sal);
		System.out.println("Employee is " + designation);
		
		
	}

}
