import java.util.*;
public class Input24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any alphabet character:");
        String s = sc.next().toLowerCase();
        char c = s.charAt(0);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            System.out.println("It is vowel");
        }
        else if(Character.isLetter(c)){
            System.out.println("It is consonant");
        }
        else{
            System.out.println("Inputted value is not a character");
        }
    }
}
