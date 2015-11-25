public class J_Exception2
{
	public static void mb_throwException()
	{
		System.out.println("Produce an ArithmeticException.");
		throw new ArithmeticException();
	}
	
	public static void mb_catchArrayException()
	{
		try
		{
			mb_throwException();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("mb_catchArrayException method catches an excepton");
			return;
		}
		System.out.println("mb_catchArrayException method does not catch the exception");
	}
	
	public static void main(String args[])
	{
		try
		{
			mb_catchArrayException();
		}
		catch(ArithmeticException e)
		{
			System.out.println("main method catches an exception");
		}
	}
}
