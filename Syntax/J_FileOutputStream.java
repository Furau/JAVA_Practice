import java.io.*;

public class J_FileOutputStream
{
	public static void main(String args[])
	{
		int i;
		byte[] b = new byte[10];
		
		try
		{
			FileOutputStream f = new FileOutputStream("out.txt");
			for(i=0;i<10;i++)b[i]=(byte)(48+i);
			f.write(b);
			f.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}