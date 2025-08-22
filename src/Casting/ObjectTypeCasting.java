package Casting;
//Java is an Object-Oriented Language, so we can cast between classes,
// but only if there is a parent-child (inheritance) relationship
//Subclass → Superclass
//Done automatically by compiler.
//Upcasting (Implicit)
public class ObjectTypeCasting {
   void sound(){
       System.out.println("Home");
   }

    }
    class Animal extends ObjectTypeCasting{
    void bark(){
        System.out.println("Barking..");
    }

        public static void main(String[] args) {
            ObjectTypeCasting a = new Animal();

            a.sound();


          // a.bark();
        }
    }

