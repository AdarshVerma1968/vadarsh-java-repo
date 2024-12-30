import java.util.Scanner;

public class Program3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();
        System.out.println("Area of circle = " + (3.14*r*r));
        System.out.println("Ciumference of circle = "+(2*3.14*r));
    }
}
