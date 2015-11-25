class J_Experiment
{
	private int m_temperature,m_pressure;
	private boolean m_ready=false;
	
	public synchronized void mb_update(int t,int p)
	{
		while(m_ready)
		{
			try
			{
				wait();
			}
			
			catch(Exception e)
			{
				
			}
		}
		m_temperature = t;
		m_pressure = p;
		System.out.println("Update: temprature="+t+",pressure="+p+".");
		m_ready=true;
		notify();
	}
	
	public synchronized void mb_analyze()
	{
		while(!m_ready)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{
				
			}
		}
			int t = m_temperature;
			int p = m_pressure;
			System.out.println("Get:temperature="+t+",pressure="+p+".");
			m_ready=false;
			notify();
	}
}

class J_Assistant extends Thread
{
	J_Experiment m_data;
	public J_Assistant(J_Experiment d)
	{
		m_data=d;
	}
	
	public void run()
	{
		int i,j,k;
		for(k=0;k<4;k++)
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
		int k;
		for(k=0;k<4;k++)
		{
			m_data.mb_analyze();
		}
	}
}

public class J_Wait
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