package basicofjava;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		int flag=0;
		if(n==0||n==1)
		{  
			 System.out.println(n+" is not prime number");      
		}
		for(int i=2;i<=n/2;i++)
		{      
		   if(n%i==0)
		   {      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }    
		   if(flag==0) 
		   { 
			   System.out.println(n+" is prime number"); 
			  }  
		  }
	}

}
