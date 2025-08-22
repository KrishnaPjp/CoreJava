package Casting;

public class Library {
    void show(){
        System.out.println("Book");
    }
}
class Book extends Library{
    void  display(){
        System.out.println("Math ");
    }
}
class  Main{
    public static void main(String[] args) {
        Library l = new Book();//Upcasting
        l.show();

        Book b = (Book) l;
        b.display();//DownCasting
    }
}
