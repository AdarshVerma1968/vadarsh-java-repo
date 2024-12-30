import java.util.*;
public class Input8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("Inputted number is even");
        }
        else{
            System.out.println("Inputted number is odd");
        }
    }
}
