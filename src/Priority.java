public class Priority extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Priority t1=new Priority();
        Priority t2=new Priority();
        System.out.println("priority of thread 1:"+t1.getPriority());
        System.out.println("priority of thread 2:"+t2.getPriority());
        t1.start();
        t2.start();
    }
}
