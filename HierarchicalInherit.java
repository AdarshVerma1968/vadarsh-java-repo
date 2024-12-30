class Student{
    void method(){
        System.out.println("I have many Branches");
    }
}
class Adarsh extends Student{
    void display(){
        System.out.println("I am student of MCA");
    }
}
class Tanmay extends Student{
    void look(){
        System.out.println("I am student of BTECH");
    }
}
public class HierarchicalInherit { 
    public static void main(String[] args) {
        Tanmay t = new Tanmay();
        Adarsh a = new Adarsh();
        t.look();
        a.display();
        t.method();
    }
}
