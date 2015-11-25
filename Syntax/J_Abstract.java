abstract class A_Class
{
	public abstract String output();
}

class B_Class extends A_Class
{
	public String output()
	{
		return "I'm overriding Abstract SuperClass's method";
	}
}

public class J_Abstract
{
	public static void main(String args[])
	{
		A_Class a=new B_Class();
		System.out.println();
		System.out.println(a.output());
	}
}