package StaticKeyword;
//A static block in Java is used to initialize static variables.
//It runs only once, when the class is loaded into memory, before the main method runs
public class ExaNested {
    static class Inner {
        void show() {
            System.out.println("Static nested class");
        }
    }

    public static void main(String[] args) {
        ExaNested.Inner obj = new ExaNested.Inner();
        obj.show();
    }
}
