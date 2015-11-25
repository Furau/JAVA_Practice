class J_Class
{
	static int m_data;
}

public class J_Example
{
	public static void main(String args[])
	{
		J_Class a = new J_Class();
		J_Class b = new J_Class();
		a.m_data=5;
		System.out.println("m_data in instance a is equal to "+a.m_data);
		System.out.println("m_data in instance b is equal to "+b.m_data);
		System.out.println("m_data in class J_Class is equal to "+J_Class.m_data);
		b.m_data=10;
		System.out.println("m_data in instance a is equal to "+a.m_data);
		System.out.println("m_data in intance b is equal to "+b.m_data);
		System.out.println("m_data in class J_Class is equal to "+J_Class.m_data);
	}
}