package MultiThreading;

public class UsingRunnable implements Runnable{
       public synchronized void run() {
           for(int i=0;i<10;i++) {
               System.out.println("Hii");
             //  Thread.yield();
               try {
                   Thread.sleep(1000);
               } catch (Exception e) {
                   throw new RuntimeException(e);
               }
           }
    }
}
class Demo1 implements Runnable{
    public void run(){
        for(int i=0;i<10;i++) {
            System.out.println("go");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Main1{
    public static void main(String[] args) {
        UsingRunnable u =new UsingRunnable();
        Demo1 d = new Demo1();
        Thread t1 = new Thread(u);
        Thread t2 = new Thread(d);

        t1.start();
        try{
            t1.join();
        } catch (Exception e) {
            System.out.println("error");
        }

        t2.start();


    }
}
