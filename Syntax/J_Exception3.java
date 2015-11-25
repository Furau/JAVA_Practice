class J_ExceptionNew extends Exception
{
	int m_id;
	public J_ExceptionNew(int i)
	{
		super();
		m_id=i;
	}
	public String toString()
	{
		return (new String("J_ExceptionNew:ID="+m_id));
	}
}

public class J_Exception3
{
	public static void mb_throwException() throws J_ExceptionNew
	{
		throw new J_ExceptionNew(5);
	}
	
	public static void mb_method() throws J_ExceptionNew
	{
		try
		{
			mb_throwException();
		}
		catch(Exception e)
		{
			System.out.println("mb_method catches "+e);
			throw new J_ExceptionNew(10);
		}
	}
	
	public static void main(String args[])
	{
		try
		{
			mb_method();
		}
		catch(Exception e)
		{
			System.out.println("main catches "+e);
		}
	}
}