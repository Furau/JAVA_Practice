class SuperClass
{
	SuperClass()
	{
		System.out.println("This is the SuperClass");
	}
	public String toString()
	{
		return ("Yes,I'm override from \"Object\" Class.");
	}
}
class SubClass extends SuperClass
{
	SubClass()
	{
		System.out.println("This is the SubClass");
	}
	public String toString()
	{
		return ("Yes,I'm override from \"object\" and \"SuperClass\"!");
	}
}

public class J_Override
{
	public static void main(String args[])
	{
		SuperClass a=new SuperClass();
		System.out.println(a.toString());
		a=new SubClass();
		System.out.print(a.toString());
	}
}

