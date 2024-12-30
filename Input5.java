import java.util.Scanner;
public class Input5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Hours = " + (n/3600));
        System.out.println("Minutes = " + (n/60));
        System.out.println("Seconds = " + n);
    }
}
