import java.util.Scanner;
public class YearMonthDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number=");
        int num = input.nextInt();
        System.out.println("Year  = "+(num/365));
        System.out.println("Month = "+(num/30));
        System.out.println("Days = "+num);
    }
    

}
