class Animal{
    Animal(){
        System.out.println("I have four legs");
    }
}
class Dog extends Animal{
    Dog(){
        super(); //Invoke immediate parent class constructor
        System.out.println("I can bark");
    }
}

public class TestSuper2 {
    public static void main(String[] args) {
        Dog d =  new Dog();
    }
}
