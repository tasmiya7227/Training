package javaprograming;

public class Constructor {
	String empname;
	int empid;
	int empsal;
	String designation;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor emp1= new Constructor("Tasmiya",12, 30000, "abc");
		emp1.display();
		
		Constructor emp2= new Constructor("Shaviz",13, 40000, "pqr");
		emp2.display();
		
	}
	
	Constructor(String empname_temp, int empid_temp, int empsal_temp,String designation_temp)
	{
		empname=empname_temp;
		empid=empid_temp;
		empsal=empsal_temp;
		designation=designation_temp;
	}
	void display()
	{
		System.out.println("Employee name is " + empname);
		System.out.println("Employee id is " + empid);
		System.out.println("Employee sal is " + empsal);
		System.out.println("Employee is " + designation);
		
		
	}

}
