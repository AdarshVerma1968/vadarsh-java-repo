import java.util.Scanner;
public class Input4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter item name=");
        String name = input.nextLine();
        System.out.print("Enter item rate=");
        int rate = input.nextInt();
        System.out.print("Enter item Quantity=");
        int quantity = input.nextInt();
        int dis=((rate*quantity)*10)/100;
        int fp = (rate*quantity)-dis;
        System.out.println("Name of item is:"+name);
        System.out.println("Final price="+fp);       
    }

}
