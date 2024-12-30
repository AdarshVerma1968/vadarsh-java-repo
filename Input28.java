import java.util.*;
public class Input28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st num:");
        int x = sc.nextInt();
        System.out.print("Enter 2nd num:");
        int y = sc.nextInt();
        System.out.print("Enter arithmetic operator:");
        String s = sc.next();
        char c = s.charAt(0);
        switch (c) {
            case '+':
                System.out.println("Arithmetic Operation:"+(x+y));
                break;
            case '-':
                System.out.println("Arithmetic Operation:"+(x-y));
                break;
            case '*':
                System.out.println("Arithmetic Operation:"+(x*y));
                break;
            case '/':
                System.out.println("Arithmetic Operation:"+(x/y));
                break;
            case '%':
                System.out.println("Arithmetic Operation:"+(x%y));
                break;
            default:
                System.out.println("Please enter arithmetic operator");
        }
    }
}
