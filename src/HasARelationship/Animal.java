package HasARelationship;

public class Animal {
    void sound(){
        System.out.println("Animal are going ..");
    }
}

class Dog extends Animal{ //Is a relationship
    @Override
    void sound() {
        System.out.println("Dog is barking..");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a = new Animal();
        d.sound();
        a.sound();
    }
}
