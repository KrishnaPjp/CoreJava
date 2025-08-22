package HasARelationship;

public class Engine {
    void start(){
        System.out.println("Engine started ");
    }
}
class Car{

    Engine e = new Engine(); //Has a relationship

    void startCar(){
        e.start();
        System.out.println("Car is started..");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.startCar();
    }
}
