import java.util.*;
public class Input27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the alphabet:");
        String s = sc.next().toLowerCase();
        char c = s.charAt(0);
        switch (c) {
            case 'a':
                System.out.println("It is vowel");
                break;
            case 'e':
                System.out.println("It is vowel");
                break;  
            case 'i':
                System.out.println("It is vowel");
                break;
            case 'o':
                System.out.println("It is vowel");
                break;
            case 'u':
                System.out.println("It is vowel");
                break;  
            default:
                System.out.println("Please enter alphabet");
        }
    }
}
