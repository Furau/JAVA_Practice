package in.jaxa.rthread;

/**
 * Created by Pal on 9/6/2015.
 */
public class R_Thread implements Runnable{
    private int m_ThreadID;
    R_Thread(int i){
        System.out.println("Create thread "+i);
        m_ThreadID=i;
    }

    public void run(){
        int i;
        for(i=0;i<3;i++){
            System.out.println("Runing thread " + m_ThreadID);
            try{
                Thread.sleep((int)Math.random()*1000);
            }catch (InterruptedException ex){
                System.out.println(ex.toString());
            }
        }
    }

    public static void main(String[] args) {
        Thread t1=new Thread(new R_Thread(1));
        Thread t2=new Thread(new R_Thread(2));
        t1.start();
        t2.start();
        System.out.println("End of main");
    }

}
