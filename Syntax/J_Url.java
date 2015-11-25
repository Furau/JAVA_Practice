import java.net.*;

public class J_Url
{
	public static void main(String args[])
	{
		try
		{
			URL url = new URL("http://jaxa.in");
			System.out.println("protocol = "+url.getProtocol());
			System.out.println("host = "+url.getHost());
			System.out.println("Port = "+url.getPort());
			System.out.println("filename = "+url.getFile());
			System.out.println("ref = "+url.getRef());
		}
		catch(MalformedURLException e)
		{
			System.err.println(e);
		}
	}
}