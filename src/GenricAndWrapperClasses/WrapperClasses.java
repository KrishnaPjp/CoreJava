package GenricAndWrapperClasses;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer obj = new Integer(12);
        Integer obj2 = new Integer("12");
        System.out.println(obj2*3);

        Integer obj3 = 24; //Autoboxing
        int age = obj3; //Inboxing

        System.out.println(age);
        System.out.println(obj3);
    }
}
