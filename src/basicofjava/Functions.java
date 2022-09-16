package basicofjava;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions fun = new Functions();
		int sum = fun.add(10, 20);
		int difference = fun.sub(20, 10);
		int multiplication = fun.mul(2,  2);
		int division = fun.div(4,  2);
		System.out.println("Sum of 2 numbers = " + sum);
		System.out.println("Difference of 2 numbers = " + difference);
		System.out.println("Multiplication of 2 numbers = " + multiplication);
		System.out.println("Division of 2 numbers = " + division);
	}
	
	int add(int a, int b)
	{
		int sum=a+b;
		return sum;
	}
	
	
	int sub(int a, int b)
	{
		int sub=a-b;
		return sub;
	}

	int mul(int a, int b)
	{
		int mul=a*b;
		return mul;
	}

	int div(int a, int b)
	{
		int div=a/b;
		return div;
	}

	public int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

}
