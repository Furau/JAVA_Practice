class J_SuperClass
{
	J_SuperClass()
	{
			System.out.println("Enter:J_SuperClass()");
	}
	
	public String toString()
	{
		return ("This is a method in the superclass.");
	}
}

class J_SubClass extends J_SuperClass
{
	J_SubClass()
	{
		System.out.println("Enter:J_SubClass()");
	}
	
	public String toString()
	{
		return ("This a method in the subclass.");
	}
}

public class J_Extends
{
	public static void main(String args[])
	{
		J_SubClass a=new J_SubClass();
		J_SuperClass b=new J_SuperClass();
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.print("An instance of a subclass is an instance of a super class");
		System.out.println(":"+(a instanceof J_SuperClass));
		System.out.println("An instance of a superclass is an instance of a subclass");
		System.out.print(":"+(b instanceof J_SubClass));
	}
}