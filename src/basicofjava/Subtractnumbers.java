package basicofjava;

public class Subtractnumbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Subtractnumbers obj = new Subtractnumbers();
	obj.sub(20, 10);
	obj.sub(12.5f, 10.5f);
	obj.sub(30, 20,10);
	
	}
	void sub(int x, int y) 
	{
		int sub = x-y;
		System.out.println("Subtraction of numbers = " + sub);
	}
	void sub(float x, float y) {
		float sub = x-y;
		System.out.println("Subtraction of numbers = " + sub);
	}
	
	void sub(int x, int y,int z)
	{
		int sub=x-y-z;
		System.out.println("Subtraction of numbers = " + sub);
	}
	
}
	
