package javaprograming;
interface  inter1
{
	void m1();
}
interface inter2 extends inter1
{
	void m2();
	
}
public class Interface2 implements inter1, inter2
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 obj = new Interface2();
		obj.m1();
		obj.m2();
	}
	public void m1()
	{
		System.out.println("M1 code");
	}
	public void m2()
	{
		System.out.println("M2 code");
	}

}
