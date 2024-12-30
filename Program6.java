public class Program6 {
    //Constructor Overloading

    Program6(){
        System.out.println("Welcome");
    }
    Program6(String name){
        System.out.println("Welcome " + name);
    }

    //Method Overloading

    public void add(int a,int b){
        System.out.println("Sum of "+ a + "+" + b + "+" + "=" + (a+b));
    }
    public void add(double a,double b){
        System.out.println("Sum of " + a + "+" + b + "+" + "=" + (a+b));
    }
    
    public static void main(String[] args) {
        Program6 p1 = new Program6();
        Program6 p2 = new Program6("Adarsh");
        p1.add(5, 10);
        p2.add(5.6, 4.9);
    }
}
