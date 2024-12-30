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
class Run extends Dog{
    void run(){
        System.out.println("I can run fast");
    }
}
public class MultilevelInherit {
    public static void main(String[] args) {
        Run r = new Run();
        r.method();
        r.display();
        r.run();
    }
}
