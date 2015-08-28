package in.jaxa.frametest;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Guu on 28/8/15.
 */
public class FrameTest {
    public static void main(String[] args) {
        /*Frame f=new Frame();
        f.setLocation(20,20);
        f.setSize(500, 500);
        f.setBackground(Color.BLUE);
        f.setResizable(false);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);*/  //section 1
        /*new MultiFrame(100,100,200,200,Color.red);
        new MultiFrame(200,200,100,100,Color.green);*/ //Section 2
        /*Frame f1=new Frame();
        Panel panel=new Panel();
        panel.setBounds(30,30,400,400);
        panel.setLocation(50,50);
        panel.setBackground(Color.ORANGE);
        f1.setLocation(100,100);
        f1.setLayout(null);
        f1.setBackground(Color.cyan);
        f1.setSize(500,500);
        f1.setResizable(false);
        f1.add(panel);
        f1.setVisible(true);*/  //Section 3
        //new MultiPanelOfFrame("Hello",10,10,500,500);//Section 4
        new MFrame("Pupu",200,100,600,400);
    }
}

class MultiFrame extends Frame{
    static int id=0;
    MultiFrame(int x,int y,int w,int h,Color c){
        super("Multi Frame "+(id++));
        setBackground(c);
        setLayout(null);
        setBounds(x,y,w,h);
        setVisible(true);
    }
}

class MultiPanelOfFrame extends Frame{
    private Panel p1,p2,p3,p4;
    MultiPanelOfFrame(String s,int x,int y,int w,int h){
        super(s);
        setLayout(null);
        p1=new Panel(null);
        p2=new Panel(null);
        p3=new Panel(null);
        p4=new Panel(null);
        p1.setBounds(0,0,w/2,h/2);
        p2.setBounds(w/2,0,w/2,h/2);
        p3.setBounds(0,h/2,w/2,h/2);
        p4.setBounds(w/2,h/2,w/2,h/2);

        p1.setBackground(Color.red);
        p2.setBackground(Color.green);
        p3.setBackground(Color.blue);
        p4.setBackground(Color.gray);

        add(p1);
        add(p2);
        add(p3);
        add(p4);

        setBounds(x, y, w, h);
        setVisible(true);

    }
}

class MFrame extends Frame{
    Panel p=null;
    MFrame(String s,int x,int y,int w,int h){
        super(s);
        this.setBounds(x, y, w, h);
        this.setBackground(Color.blue);
        this.setLayout(null);
        p=new Panel(null);
        p.setBounds(w/3,h/3,w/3,h/3);
        p.setBackground(Color.orange);
        this.add(p);
        this.setVisible(true);
    }
}

