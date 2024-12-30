import java.util.Scanner;

class Outer{
    private int outdata;
    void setOutdata(int outdata){
        this.outdata=outdata;
    }
    void display(){
        Inner in = new Inner();
        System.out.println("Accessing from outer class");
        System.out.println("The value of outdata is = " + outdata);
        System.out.println("The value of indata is = " + in.indata);
    }

    class Inner{
        private int indata;
        void setIndata(int indata){
            this.indata=indata;
        }
        void inmethod(){
            System.out.println("Accessing from innner class");
            System.out.println("The sum of outdata and indata is = " + (outdata+indata));
        }
    }
}

public class Program5input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //creating instances
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();

        //Taking input for outdata
        System.out.print("Enter the outdata: ");
        int outdata = sc.nextInt();
        out.setOutdata(outdata);

        //Taking input for indata
        System.out.print("Enter the indata: ");
        int indata = sc.nextInt();
        in.setIndata(indata);

        //Displaying values
        out.display();
        in.inmethod();
    }

}
