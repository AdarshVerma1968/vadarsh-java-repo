import java.util.*;
public class Input21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        if(n>10 && n<20){
            System.out.println("Inputted number is between 10 and 20");
        }
        else{
            System.out.println("Inputted number is not between 10 and 20");
        }
    }
}
