import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class J_Test extends JFrame
{
	public J_Test()
	{
		super("Test anonymous inner class");
		Container container=getContentPane();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton b = new JButton("Press me");
		container.add(b);
		b.addActionListener(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					System.out.println("The button is presse!");
				}
			}
		);
		setSize(100,80);
		setVisible(true);
	}
	public static void main(String args[])
	{
		J_Test application = new J_Test();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}