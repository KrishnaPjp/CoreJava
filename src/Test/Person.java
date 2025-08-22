package Test;

//Write a program to sort all the keys of a Map (use TreeMap)
public class Person {
    private String name ;
    private int id;
    private String address;

    public Person(String name, int id,String address){
        this.name=name;
        this.id=id;
        this.address=address;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                '}';
    }
}
