class Animal{
    void method(){
        System.out.println("I have four legs");
    }
}
class Dog extends Animal{
    void display(){
        System.out.println("I can bark");
    }
}

public class SingleInherit {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.method();
        d.display();
    }
}
