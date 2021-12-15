//Multithreading using runnable interface
public class StartExp2 implements Runnable{
    public void run(){
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        StartExp1 obj=new StartExp1();
        //we have created new thread object
        Thread t1=new Thread(obj);
        //we are calling start method
        t1.start();

    }
}
