class J_Class
{
	class J_Inner
	{
		void mb_methodInner()
		{
		System.out.println("Enter the method of the inner class");
		}
	}
}

public class J_InnerClass
{
	public static void main(String args[])
	{
		J_Class a = new J_Class();
		J_Class.J_Inner b=a. new J_Inner();
		b.mb_methodInner();
	}
}