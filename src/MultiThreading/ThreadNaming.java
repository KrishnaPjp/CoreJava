package MultiThreading;

public class ThreadNaming extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
    }

}
 class Test{
     public static void main(String[] args) {
         ThreadNaming t1 = new ThreadNaming();
         ThreadNaming t2 = new ThreadNaming();
         ThreadNaming t3 = new ThreadNaming();

         System.out.println("Main Thread "+Thread.currentThread().getName());
         System.out.println("Main Thread "+Thread.currentThread().getId());

         t1.setName("Krishna ");
         t1.setName("Ratan ");
         t1.setName("Ravi ");

         t1.start();
         t2.start();
         t3.start();
     }
}