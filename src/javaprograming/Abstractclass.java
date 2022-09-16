package javaprograming;
abstract class Abc
{
	abstract void m1();
	void m2() {
		System.out.println("M2 code");
	}
}
public class Abstractclass extends Abc{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractclass obj = new Abstractclass();
		obj.m1();
		obj.m2();
	}
	void m1() {
		System.out.println("M1 code");
	}

}
