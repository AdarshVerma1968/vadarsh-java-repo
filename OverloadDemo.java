public class OverloadDemo {
    void add(){
        System.out.println("Function without parameter");
    }
    void add(int a,int b){
        System.out.println("Addition a and b : " + (a+b));
    }
    void add(double a,double b){
        System.out.println("Multiplication of a and b : " + (a*b));
    }
    public static void main(String[] args) {
        OverloadDemo o = new OverloadDemo();
        o.add();
        o.add(4, 7);
        o.add(4.8, 8.9);
    }
}
