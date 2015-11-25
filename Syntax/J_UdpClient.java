import java.net.*;
import java.io.*;

public class J_UdpClient
{
	public static void main(String args[]) throws IOException
	{
		DatagramSocket dSocket;
		DatagramPacket inPacket;
		DatagramPacket outPacket;
		InetAddress sAddr;
		byte[] inBuffer = new byte[100];
		byte[] outBuffer;
		String s="Hello";
		try
		{
			dSocket = new DatagramSocket();
			sAddr = InetAddress.getLocalHost();
			outBuffer = s.getBytes();
			outPacket = new DatagramPacket(outBuffer,outBuffer.length,sAddr,8000);
			dSocket.send(outPacket);
			inPacket = new DatagramPacket(inBuffer,inBuffer.length);
			dSocket.receive(inPacket);
			s = new String(inPacket.getData(),0,inPacket.getLength());
			System.out.println(s);
			dSocket.close();
		}
		catch(IOException e)
		{
			System.out.println("IOException occurred with socket.");
			System.out.println(e);
			e.printStackTrace();
		}
	}
}