class Animal{
    String color = "White";
}
class Dog extends Animal{
    String color = "Black";
    void display(){
        System.out.println(super.color); //Super refers immediate parent class variable
    }
}

public class TestSuper1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
