public class J_Intern
{
	public static void main(String args[])
	{
		String s0 = "String Literal";
		String s1 = "String Literal";
		String s2 = new String("String Literal");
		String s3 = s2.intern();
		System.out.println("s1==s0 is "+(s1==s0));
		System.out.println("s2==s0 is "+(s2==s0));
		System.out.println("s3==s0 is "+(s3==s0));
		System.out.println("s2.intern()==s0.intern() is "+(s2.intern()==s0.intern()));
	}
}