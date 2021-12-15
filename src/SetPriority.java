//to get the maximum priority
public class SetPriority extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        SetPriority t1=new SetPriority();
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
    }
}
