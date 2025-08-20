package Method;

public class MethodEx3 
{
	void addition(int a,int b)
	{
		int sum = a+b;
		System.out.println("Addition of numbers is:"+sum);
	}
	public static void main(String[] args)
	{
		MethodEx3 obj = new MethodEx3();
		obj.addition(44, 45);
		obj.addition(54, 15);
	}
}
