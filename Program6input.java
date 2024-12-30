import java.util.Scanner;

public class Program6input {
    //Constructor Overloading

    Program6input(){
        System.out.println("Welcome");
    }
    Program6input(String name){
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
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        Program6input p1 = new Program6input();
        Program6input p2 = new Program6input(name);

        System.out.print("Enter first int: ");
        int int1 = sc.nextInt();
        System.out.print("Enter second int: ");
        int int2 = sc.nextInt();
        p1.add(int1,int2);

        System.out.print("Enter first double: ");
        double double1 = sc.nextDouble();
        System.out.print("Enter second double: ");
        double double2 = sc.nextDouble();
        p2.add(double1,double2);
    }
}
