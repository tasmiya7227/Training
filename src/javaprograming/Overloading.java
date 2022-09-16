package javaprograming;

public class Overloading {
	 void main( )
	 { 
	   System.out.println("main 1"); 
	    
	 } 
	void main2(int a)
	{ 
	   System.out.println("main 2"); 
	 } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Default main");
		Overloading obj= new Overloading();
		obj.main();
		obj.main2(12);
	}

}
