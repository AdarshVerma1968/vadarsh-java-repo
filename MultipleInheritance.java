interface Rectangle{
    void areaRectangle(double w,double l);
}
interface Triangle{
    void areaTriangle(double b,double h);
}
interface Circle{
    void areaCircle(double r);
}
class Shape implements Rectangle,Triangle,Circle{
    public void areaRectangle(double w,double l){
        System.out.println("Area of rectangle = " + (w*l));
    }
    public void areaTriangle(double b,double h){
        System.out.println("Area of triangle = " + (0.5*b*h));
    }
    public void areaCircle(double r){
        System.out.println("Area of Circle = " + (3.14*r*r));
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.areaRectangle(5.6, 8.6);
        s.areaTriangle(5.3, 7.6);
        s.areaCircle(8.9);
    }

}
