interface Rectangle{
    void areaRectangle(double w,double h);
}
interface Triangle{
    void areaTriangle(double b,double h);
}

class Shapes implements Rectangle,Triangle{
    public void areaRectangle(double w,double h){
        System.out.println("Area of Rectangle = " + (w*h));   
    }
    public void areaTriangle(double b,double h){
        System.out.println("Area of Triangle = " + (0.5*b*h));
    }
}

class Program7  {
    public static void main(String[] args) {
        Shapes sc = new Shapes();
        sc.areaRectangle(4.8, 5.9);
        sc.areaTriangle(8.6, 6.6);
    }
}
