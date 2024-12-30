import java.util.*;
public class Input10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time:");
        int n = sc.nextInt();
        if(n>12){
            System.out.println("Time:"+(n-12)+":00");
        }
        else{
            System.out.println("Time:"+n+":00");
        }
    }
}
