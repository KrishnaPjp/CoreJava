package MultiThreading;

public class Sum extends Thread{

    int a,b;
    Sum (int a ,int b){
    this.a =a;
    this.b=b;
    }

    public void run() {
        System.out.println(a+b);

    }
}
 class Sumofall{
     public static void main(String[] args) {
         Sum s = new Sum(4,5);
         s.start();
     }
 }
