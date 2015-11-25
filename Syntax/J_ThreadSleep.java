public class J_ThreadSleep extends Thread
{
	private int m_sleepTime;
	
	public J_ThreadSleep(String name,int t)
	{
		super(name);
		m_sleepTime = t;
	}
	
	public void loop()
	{
		for(int i=0;i<100;i++)
		{
			double d = Math.sin(i);
			int j = (int)d+i;
			i = j-(int)d;
		}
	}
	
	public void run()
	{
		System.out.println(getName()+" begins running.");
		int k=2;
		for(int i=0;i<k;i++)
		{
			System.out.println(getName()+" : "+i+" with priority "+getPriority());
			for(int j=0;j<1000;j++)loop();
		}
		try
		{
			sleep(m_sleepTime*1000);
		}
		catch(InterruptedException e)
		{
		}
		for(int i=k;i<k+k;i++)
		{
			System.out.println(getName()+" : "+i+" with priority "+getPriority());
			for(int j=0;j<100;j++)loop();
		}
	}
	
	public static void main(String args[])
	{
		J_ThreadSleep frank = new J_ThreadSleep("Frank",1);
		J_ThreadSleep mary  = new J_ThreadSleep("Mary",2);
		J_ThreadSleep alice = new J_ThreadSleep("Alice",2);
		J_ThreadSleep chris = new J_ThreadSleep("Chris",1);
		mary.setPriority(Thread.NORM_PRIORITY);
		alice.setPriority(Thread.NORM_PRIORITY);
		chris.setPriority(Thread.MAX_PRIORITY);
		frank.start();
		mary.start();
		alice.start();
		chris.start();
	}
}