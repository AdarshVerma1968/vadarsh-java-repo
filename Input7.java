import java.util.Scanner;
public class Input7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        if(n>100){
            System.out.println("Inputed number is Greater than 100");
        }
        else{
            System.out.println("Inputed number is not Greater than 100");
        }
    }
}
