import java.util.*;
public class Input9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        if(n>0){
            System.out.println("Inputted number is positive");
        }
        else{
            System.out.println("Inputted number is negative");
        }
    }
}
