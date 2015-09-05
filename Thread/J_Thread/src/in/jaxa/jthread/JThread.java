package in.jaxa.jthread;

/**
 * Created by Pal on 9/5/2015.
 */
public class JThread extends Thread{
    private int mthreadID;
    public JThread(int i){
        System.out.println("Create thread"+i);
        mthreadID=i;
    }
    public void run(){
        int i;
        for(i=0;i<3;i++){
            System.out.println("Runing thread:"+mthreadID);
            try{
                Thread.sleep((int)(Math.random()*1000));
            }catch (InterruptedException ex){
                System.err.println(ex.toString());
            }
        }
    }

    public static void main(String[] args) {
        new JThread(1).start();
        new JThread(2).start();
        System.out.println("End of main");
    }
}
