abstract class Student{
    abstract void display();
}
public class Abstractprogram extends Student {
    void display(){
        System.out.println("I am adarsh");
    }
    public static void main(String[] args) {
        Student s = new Abstractprogram();
        s.display();
    }
}
