import java.io.FileInputStream;

public class J_FileInputStream
{
	public static void main(String args[])
	{
		int i;
		int b;
		try
		{
			FileInputStream f = new FileInputStream("test.txt");
			b = f.read();
			for(i=0;b!=-1;i++)
			{
				System.out.print((char)b);
				b = f.read();
			}
			System.out.println();
			System.out.print("TOTAL="+i);
			f.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}