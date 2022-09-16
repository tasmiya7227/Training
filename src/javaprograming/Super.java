package javaprograming;
class Animal{
	void animals() {
		System.out.println("Tiger");
	}
}

class Birds extends Animal{
	void animals() {
		System.out.println("Peacock");
		super.animals();
	}
}
public class Super extends Birds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Super obj = new Super();
		obj.animals();
		
	}
	void animals() {
		super.animals();
		System.out.println("Dog");
	}
	
}
