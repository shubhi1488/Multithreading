//this was created by extending the thread class
public class StartExp1 extends Thread{
    public void run(){
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        StartExp1 obj=new StartExp1();
        obj.start();
    }
}
