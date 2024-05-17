
public class SubStatic extends StaticDemo{
	
	
   void sum()
	{
		System.out.println("Sub method");
		System.out.println("Static variable of super class ="+StaticDemo.s_count);
		
	}
	
	static void sub()
	{
		
	}
	
     public static void main(String[] args) {
		
		System.out.println("Static variable of super class ="+StaticDemo.s_count);
		
	

	}

}
