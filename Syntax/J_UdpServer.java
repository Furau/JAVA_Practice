import java.net.*;
import java.io.*;
import java.util.Date;

public class J_UdpServer
{
	public static byte[] mb_getTime()
	{
		Date d = new Date();
		return d.toString().getBytes();
	}
	
	public static void main(String args[])
	{
		DatagramSocket dSocket;
		DatagramPacket inPacket;
		DatagramPacket outPacket;
		InetAddress cAddr;
		int cPort;
		byte[] inBuffer = new byte[100];
		byte[] outBuffer;
		String s;
		try
		{
			dSocket = new DatagramSocket(8000);
			while(true)
			{
				inPacket = new DatagramPacket(inBuffer,inBuffer.length);
				dSocket.receive(inPacket);
				cAddr = inPacket.getAddress();
				cPort = inPacket.getPort();
				s = new String(inPacket.getData(),0,inPacket.getLength());
				System.out.println("Client Adr="+cAddr.getHostName()+" at Port "+cPort+": "+s);
				outBuffer = mb_getTime();
				outPacket = new DatagramPacket(outBuffer,outBuffer.length,cAddr,cPort);
				dSocket.send(outPacket);
			}
		}
		catch(IOException e)
		{
			System.out.println("IOException occurred with socket.");
			System.out.println(e);
			e.printStackTrace();
		}
		
	}
}