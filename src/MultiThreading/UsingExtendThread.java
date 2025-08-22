
package MultiThreading;

 class UsingExtendThread extends  Thread {
     public void run() {

         for (int i = 1; i <= 5; i++) {
             System.out.println("Thread is running: ");
             try {
                 Thread.sleep(500);
             } catch (InterruptedException e) {
                 System.out.println(e);
             }
         }
     }
 }
class New {
    public static void main(String[] args) {
        UsingExtendThread t1 = new UsingExtendThread();
        t1.start();
    }

}