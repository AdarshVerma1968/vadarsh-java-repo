public class Testfinal1 {
    final int speed = 200;
    void method(){
        int speed = 100;
        System.out.println(speed);
    }
    public static void main(String[] args) {
        Testfinal1 h = new Testfinal1();
        h.method();
    }
}
