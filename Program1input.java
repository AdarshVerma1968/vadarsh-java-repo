import java.util.Scanner;

public class Program1input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(n>0){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++)
                System.out.print(j + " ");
                System.out.println();
            }
        }
        else if(n<0){
            System.out.println("Please enter positive number");
        }
        else if(n==0){
            System.out.println("Enter number greater then zero");
        }
    }
}
