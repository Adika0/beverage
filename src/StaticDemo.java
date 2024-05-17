
public class StaticDemo {
	
	static int s_count=0;
	       int n_count=0;
	
	public StaticDemo()
	{
		s_count++;//1->2->3
		n_count++;//1->1->1
		System.out.println("Static variable value= "+s_count);
		System.out.println("Non static variable value= "+n_count);
		
	}
	
	
	

	public static void main(String[] args) {
		
		StaticDemo s1=new StaticDemo();
		StaticDemo s2=new StaticDemo();
		StaticDemo s3=new StaticDemo();
		
	}

}
