import java.io.OutputStream;
import java.io.IOException;

public class J_OutputStream
{
	public static void main(String args[])
	{
		String s="Wonderful OutputStream!";
		byte[] b;
		OutputStream out = System.out;
		b = s.getBytes();
		try 
		{
			out.write(b);
			out.flush();
		}
		catch(IOException e)
		{
			System.err.println(e);
		}
	}
}