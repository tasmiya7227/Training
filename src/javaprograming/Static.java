package javaprograming;

public class Static {

	String empname;
	int empid;
	int sal;
	String designation;
	static String companyname;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static emp1=new Static();
		emp1.init("Tasmiya", 1,30000,"Abc");
		initstaticData();
		emp1.display();
		
		Static emp2=new Static();
		emp2.init("Neha", 2,40000, "Pqr");
		emp2.display();
	}
	
	void init(String empname_temp, int empid_temp, int sal_temp,String designation_temp)
	{
		empname= empname_temp;
		empid= empid_temp;
		sal=sal_temp;
		designation=designation_temp;
		
	}
	static void initstaticData()
	
	{
		companyname = "Tietoevry";
		
	}
	void display()
	{
		System.out.println("Employee name is " + empname);
		System.out.println("Employee id is " + empid);
		System.out.println("Employee sal is " + sal);
		System.out.println("Employee is " + designation);
		System.out.println("Employee company is " + companyname);
		System.out.println("");
		
		
	}
	static
	{
		System.out.println("Static block is used to intilize the static variable\n");
	}

}
