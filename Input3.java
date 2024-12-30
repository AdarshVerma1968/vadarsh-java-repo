import java.util.Scanner;
public class Input3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student name:");
        String name = input.nextLine();
        System.out.print("Enter 3 subject marks= ");
        int m1=input.nextInt();
        int m2=input.nextInt();
        int m3=input.nextInt();
        System.out.println("Name of student="+name);
        System.out.println("Total marks="+(m1+m2+m3));
        System.out.println("Average marks="+((m1+m2+m3)/3));
    }

}
