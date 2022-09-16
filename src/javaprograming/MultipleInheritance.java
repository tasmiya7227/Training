package javaprograming;
class Login1{
	void log() {
		System.out.println("Login to page ");
	}
}

class Addben1 extends Login1{
	void info() {
		System.out.println("Show the Benificery details");
	}
}

class Transferfund extends Addben1{
	void tfund() {
		System.out.println("Show the result of transfer fund");
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Transferfund obj = new Transferfund();
		obj.log();
		obj.info();
		obj.tfund();
	}

}
