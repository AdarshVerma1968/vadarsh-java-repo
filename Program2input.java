import java.util.Scanner;
public class Program2input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int fact=1,i=1;
        while(i<=n){
            System.out.println(i+"!=" + (fact=fact*i));
            i++;
        }
    }
}
