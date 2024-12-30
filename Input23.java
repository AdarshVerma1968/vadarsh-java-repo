import java.util.Scanner;
public class Input23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year:");
        int year = sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                //If the year is divisible by 100,then it also must be divisible by 400 to be a leap year
                if(year%400==0){
                    System.out.println("It is a leap year " + year);
                }
                else{
                    System.out.println("It is not a leap year "+ year);
                }
            }
            else{
                System.out.println("It is a leap year "+ year);
            }
        }
        else{
            System.out.println("It is not a leap year "+ year);
        }
    }
}
