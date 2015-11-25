class J_Experiment
{
	private int m_temperature,m_pressure;
	
	public synchronized void mb_update(int t,int p)
	{
		m_temperature = t;
		m_pressure = p;
	}
	
	public synchronized void mb_analyze()
	{
		int t = m_temperature;
		int p = m_pressure;
		if(t!=m_temperature)
		{
			System.out.println("It is very dangerous now:");
			System.out.println("p("+p+ ")!=(" + m_temperature+ ")");
			System.exit(0);
		}
		if(p!=m_pressure)
		{
			System.out.println("It is very dangerous now:");
			System.out.println("p("+p+ ")!=(" + m_pressure+ ")");
			System.exit(0);
		}
	}
}

class J_Assistant extends Thread
{
	J_Experiment m_data;
	
	public J_Assistant(J_Experiment d)
	{
		m_data = d;
	}
	
	public void run()
	{
		int i,j;
		for(;true;)
		{
			i=(int)(Math.random()*1000);
			j=(int)(Math.random()*1000);
			m_data.mb_update(i,j);
		}
	}
}

class J_Analyst extends Thread
{
	J_Experiment m_data;
	public J_Analyst(J_Experiment d)
	{
		m_data = d;
	}
	
	public void run()
	{
		for(;true;)
		{
			m_data.mb_analyze();
		}
	}
}

public class J_Synchronization
{
	public static void main(String args[])
	{
		J_Experiment data = new J_Experiment();
		J_Assistant threadA = new J_Assistant(data);
		J_Analyst threadB = new J_Analyst(data);
		threadA.start();
		threadB.start();
	}
}