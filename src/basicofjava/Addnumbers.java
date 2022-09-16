package basicofjava;

public class Addnumbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addnumbers obj = new Addnumbers();
		obj.add(10, 20);
		obj.add(11.5f, 12.5f);
		obj.add(10, 20,30);
		
	}
		void add(int x, int y) 
		{
			int sum = x+y;
			System.out.println("Addition of numbers = " + sum);
		}
		void add(float x, float y) {
			float sum = x+y;
			System.out.println("Addition of numbers = " + sum);
		}
		
		void add(int x, int y,int z)
		{
			int sum=x+y+z;
			System.out.println("Addition of numbers = " + sum);
		}
		
	}


