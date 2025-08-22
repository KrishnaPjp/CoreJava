package MultiThreading;

public class NewThread extends Thread {
     public   void run() {

         for (int i = 0; i < 5; i++) {
             System.out.println(Thread.currentThread().getName());
         try {
             sleep(1000);
         } catch (Exception e) {

             System.out.println(e);
         }
         }
      }

}

  class Demo extends Thread {
         public  void run() {
             for (int i = 0; i < 5; i++) {
                 System.out.println("Kumar");
                 try {
                     sleep(1000);
                 } catch (Exception e) {
                     System.out.println(e);
                 }
             }
         }
     }

     class Main {
         public static void main(String[] args) {
             NewThread n = new NewThread();
             n.setName("Krishna ");
             Demo d = new Demo();
             d.start();
             try {
                 d.join();
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
             n.start();

            // System.out.println(n.getPriority());

         }
     }
