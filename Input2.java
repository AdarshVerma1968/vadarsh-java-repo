import java.util.Scanner;
public class Input2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st number:");
        int a = input.nextInt();
        System.out.print("Enter the 2nd number:");
        int b = input.nextInt();
        System.out.println("Addition of two number = " + (a+b));
        System.out.println("Subtraction of two number=" + (a-b));
        System.out.println("Multiplication of two number="+(a*b));
        System.out.println("Division of two number="+(a/b));
        System.out.println("Modulus of two number="+(a%b));
        System.out.println("Square of first number="+(a*a));
        System.out.println("Cube of 2nd number="+(b*b*b));
    }

}
