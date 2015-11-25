import java.net.InetAddress;
import java.net.UnknownHostException;

public class J_InetAddress
{
	public static void main(String args[])
	{
		String s = "jaxa.in";
		InetAddress ts = null;
		try
		{
			ts = InetAddress.getByName(s);
		}
		catch(UnknownHostException e)
		{
			System.err.println(e);
		}
		if(ts!=null)
		{
			System.out.println("The IP Address of JAXA is "+ts.getHostAddress());
			System.out.println("The host name of JAXA is "+ts.getHostName());
		}
	}
}