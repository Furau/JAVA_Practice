import java.net.*;
import java.io.*;

public class J_Server
{
	public static void main(String args[])
	{
		ServerSocket server = null;
		try
		{
			server = new ServerSocket(5000);
		}
		catch(IOException e)
		{
		}
		while(true)
		{
			try
			{
				Socket s = server.accept();
				DataOutputStream dataOut = new DataOutputStream(s.getOutputStream());
				dataOut.writeUTF("Hello from server.");
				dataOut.close();
				s.close();
			}
			catch(IOException e)
			{
			}
		}
	}
}