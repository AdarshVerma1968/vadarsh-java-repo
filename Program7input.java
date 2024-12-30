import java.util.Scanner;

interface Rectangle{
    void areaRectangle(double w,double l);
}
interface Triangle{
    void areaTriangle(double b,double h);
}

class Shapes implements Rectangle,Triangle{
    public void areaRectangle(double w,double l){
        System.out.println("Area of Rectangle = " + (w*l));   
    }
    public void areaTriangle(double b,double h){
        System.out.println("Area of Triangle = " + (0.5*b*h));
    }
}

public class Program7input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        Shapes s = new Shapes();

        System.out.print("Enter width: ");
        double w = sc.nextDouble();
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        s.areaRectangle(w,l);

        System.out.print("Enter base: ");
        double b = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        s.areaTriangle(b,h);
    }
    
}
