import java.net.*;
import java.io.*;

public class J_Client1
{
	public static void main(String args[]) throws IOException
	{
		if(args.length<2)return;
		Socket s = new Socket(args[0],5000);
		BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println(in.readLine());
		PrintWriter out = new PrintWriter(new BufferedWriter(
			new OutputStreamWriter(s.getOutputStream())),true);
		String ss;
		char c;
		try
		{
			while(true)
			{
				ss = "";
				do
				{
					c = (char)(System.in.read());
					if(c!='\n'&&c!='\r')ss+=c;
				}while(c!='\n');
				out.println("Client["+args[1]+"]:"+ss);
				int n = ss.length();
				if(n>0)
				{
					c = ss.charAt(n-1);
					if(c=='q')break;
				}
			}
		}
		catch(Exception e)
		{
		}
		in.close();
		out.close();
		s.close();
	}
}