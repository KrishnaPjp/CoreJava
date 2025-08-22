package Casting;



public class PrimitiveCasting {
    public static void main(String[] args) {
        int a =10;
        double b =a;
        float f = 12.1f;
        int k = (int) f;

        System.out.println(k);

        System.out.println(b);
//Narrowing (Explicit Casting) large to small (Frection loss)
        int c =20;
        double d =(double) c;
        System.out.println(d);
    }
}
