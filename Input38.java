import java.util.*;
public class Input38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        int n = sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(n+"*"+i+"="+n*i);
            i++;
        }
    }
}
