package basicofjava;

public class Multiplicationnumbers {

		public static void main(String[] args) {
			Multiplicationnumbers obj = new Multiplicationnumbers();
			obj.mul(2,2);
			obj.mul(2.5f,3.5f);
			obj.mul(30, 20,10);
			
			}
			void mul(int x, int y) 
			{
				int mul = x*y;
				System.out.println("Multiplication of numbers = " + mul);
			}
			void mul(float x, float y) {
				float mul = x*y;
				System.out.println("Multiplication of numbers = " + mul);
			}
			
			void mul(int x, int y,int z)
			{
				int mul=x*y*z;
				System.out.println("Multiplication of numbers = " + mul);
			}
			
		}
			

	