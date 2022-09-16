package javaprograming;
class login
{
	void log()
	{
		System.out.println("To verify login details");
	}
}

class Addben extends login{
	void info()
	{
		System.out.println("Add benificery");
	}
	
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addben obj = new Addben();
		obj.log();
		obj.info();
	}
	
	

}
