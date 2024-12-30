import java.util.Scanner;

class Outer{
    private int outdata = 10;
    void display(){
        Inner in = new Inner();
        System.out.println("Accessing from outer class");
        System.out.println("The value of outdata is = " + outdata);
        System.out.println("The value of indata is = " + in.indata);
    }

    class Inner{
        private int indata = 20;
        void inmethod(){
            System.out.println("Accessing from innner class");
            System.out.println("The sum of outdata and indata is = " + (outdata+indata));
        }
    }
}
class Program5 {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.display();
        Outer.Inner in = out.new Inner();
        in.inmethod();
    }
}
