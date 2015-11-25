import java.net.*;
import java.io.*;

public class J_Client
{
	public static void main(String args[])
	{
		try
		{
		Socket s = new Socket("localhost",5000);
		DataInputStream dataIn = new DataInputStream(s.getInputStream());
		System.out.println(dataIn.readUTF());
		dataIn.close();
		s.close();
		}
		catch(IOException e)
		{
		}
	}
}