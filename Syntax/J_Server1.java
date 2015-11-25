import java.net.*;
import java.io.*;

public class J_Server1 extends Thread
{
	private Socket m_socket;
	private int m_id;
	
	public J_Server1(Socket s,int id)
	{
		m_socket = s;
		m_id = id;
	}
	
	public void run()
	{
		try
		{
			System.out.println("Socket["+m_id+"] connection success.");
			PrintWriter out = new PrintWriter(new BufferedWriter(
				new OutputStreamWriter(m_socket.getOutputStream())),true);
				out.println("Socket["+m_id+"] welcome client");
			BufferedReader in = new BufferedReader(new InputStreamReader(m_socket.getInputStream()));
			while(true)
			{
				String ss = in.readLine();
				System.out.println("Socket["+m_id+"] receive: "+ss);
				int n = ss.length();
				if(n>0)
				{
					char c = ss.charAt(n-1);
					if(c=='q')break;
				}
			}
		}
		catch(Exception e)
		{
			System.err.println("Something wrong happens");
		}
		finally
		{
			try
			{
				System.out.println("Socket["+m_id+"] is closing.");
				m_socket.close();
			}
			catch(Exception e)
			{
			}
		}
	}
	public static void main(String args[])
	{
		int n = 1;
		ServerSocket server = null;
		try
		{
			server = new ServerSocket(5000);
			System.out.println("Sever start.");
		}
		catch(IOException e)
		{
		}
		while(true)
		{
			try
			{
				System.out.println("Wait NO. "+n+" connection.");
				Socket s =server.accept();
				J_Server1 t = new J_Server1(s,n++);
				t.start();
			}
			catch(IOException e)
			{
			}
		}
	}
}