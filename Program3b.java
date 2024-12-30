import java.util.Scanner;
public class Program3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int flag=0, m=n/2;
        if(n!=0 && n!=1){
            for(int i=2;i<=m;i++){
                if(n%i==0)
                flag=1;
            }
        }
        else{
            flag=1;
        }
        if(flag==0){
            System.out.println(n + "is a prime number");
        }
        else{
            System.out.println(n + "is not a prime number");
        }
    }
}
