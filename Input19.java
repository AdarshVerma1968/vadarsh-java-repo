import java.util.*;
public class Input19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int n = sc.nextInt();
        System.out.print("Enter 2nd number:");
        int m = sc.nextInt();
        System.out.print("Enter 3rd number:");
        int o = sc.nextInt();
        if(n>m && n>o){
            System.out.println("Largest number is = "+n);
        }
        else if(m>n && m>o){
            System.out.println("Largest number is = "+m);
        }
        else if(o>n && o>m){
            System.out.println("Largest number is = "+o);
        }
        else{
            System.out.println("ALL are same number");
        }
    }
}
