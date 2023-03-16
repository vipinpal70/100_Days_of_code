public class MT8 extends Thread {
    public void run()
    {
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread");
        }
        else
            System.out.println("User Thread");
    }

    public static void main(String[] args) {
        MT8 t1=new MT8();
        MT8 t2=new MT8();
        MT8 t3=new MT8();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
/*
Daemon Thread
User Thread
User Thread
*/
