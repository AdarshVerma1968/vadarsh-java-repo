class College{
    void display(){
        System.out.println("This is TOCE");
    }
}

public class MOverriding extends College {
    void display(){
        System.out.println("Student of MCA");
    }
    public static void main(String[] args) {
        MOverriding s = new MOverriding();
        s.display();
    }
}
