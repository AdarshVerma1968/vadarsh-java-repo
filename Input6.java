import java.util.Scanner;
public class Input6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Rupees = " + n);
        System.out.println("Paisa = " + (n*100));
    }
}
