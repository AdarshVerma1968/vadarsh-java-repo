class Animal{
    void method(){
        System.out.println("This is Adarsh");
    }
}
class Dog extends Animal{
    void method(){
        System.out.println("This is Iyer");
    }
    void display(){
        super.method();
        System.out.println("Hi");
    }
}
public class TestSuper3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
