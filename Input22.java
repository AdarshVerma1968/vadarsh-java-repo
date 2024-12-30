import java.util.*;
public class Input22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Metro city name : ");
        String s = sc.nextLine();
        System.out.print("Enter the temp = ");
        double f = sc.nextDouble();
        double c = (f-32)*5/9;
        if(c<5){
            System.out.println(s + " Cool day");
        }
        else if(c>=5 && c<15){
            System.out.println(s + " Normal day");
        }
        else if(c>15){
            System.out.println(s + " Hot day");
        }
    }
}
