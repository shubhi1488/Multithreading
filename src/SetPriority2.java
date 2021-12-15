//user defined priority thread
public class SetPriority2 extends Thread{
    public void run(){
        System.out.println("running");
    }

    public static void main(String[] args) {
        SetPriority2 t1=new SetPriority2();
        SetPriority2 t2=new SetPriority2();
        t1.setPriority(4);//we have set the priority of thread 1 as 4
        t2.setPriority(6);// we have ste the priority of thread 2 as 6
        System.out.println("Priority of thread 1:"+t1.getPriority());
        System.out.println("priority of thread 2:"+t2.getPriority());
        t1.start();

    }
}
