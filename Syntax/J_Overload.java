public class J_Overload
{
	static char m_name;
	static int m_age;
	public static void mb_setData(char n)
	{
		m_name=n;
	}
	public static void mb_setData(int age)
	{
		m_age=age;
	}
	public static void main(String args[])
	{
		mb_setData('a');
		mb_setData(18);
		System.out.println("Name:"+m_name+"; Age:"+m_age);
	}
}