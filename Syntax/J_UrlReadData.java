import java.net.*;
import java.io.*;

public class J_UrlReadData
{
	public static void main(String args[])
	{
		try
		{
			URL u = new URL("http://jaxa.in");
			BufferedReader r = new BufferedReader(new InputStreamReader(u.openStream()));
			String s;
			while((s = r.readLine())!=null)System.out.println(s);
			r.close();
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}
}