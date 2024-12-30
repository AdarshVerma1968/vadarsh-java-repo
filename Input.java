import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name:");
        String name = input.nextLine();
        System.out.println("Welcome " + name);
        System.out.print("Please tell your age:");
        int age = input.nextInt();
        System.out.println("Your age is = " + age);
        Scanner innput = new Scanner(System.in);
        System.out.print("Please enter the address:");
        String address = innput.nextLine();
        System.out.println("Your address is = " + address);
    }

}
