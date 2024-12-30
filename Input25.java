import java.util.*;
public class Input25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st num:");
        int x = sc.nextInt();
        System.out.print("Enter 2nd num:");
        int y = sc.nextInt();
        System.out.println("Enter arithmetic operator(+,-,*,/,%):");
        String s = sc.next();
        char c = s.charAt(0);
        if(c=='+'){
            System.out.println("Arithmetic Operation = "+(x+y));
        }
        else if(c=='-') {
            System.out.println("Arithmetic Operation = "+(x-y));
        }
        else if(c=='*'){
            System.out.println("Arithmetic Operation = "+(x*y));
        }
        else if(c=='/'){
            System.out.println("Arithmetic Operation = "+(x/y));
        }
        else if(c=='%'){
            System.out.println("Arithmetic Operation = "+(x%y));
        }
        else{
            System.out.println("Invalid arithmetic operator");
        }
    }
}
