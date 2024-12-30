import java.util.Scanner;
public class Program4input {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a = ");
   int a = sc.nextInt();
   System.out.print("Enter b = ");
   int b = sc.nextInt();
   try{
    System.out.println("Quotient = " + (a/b));
   }
   catch(ArithmeticException e){
    System.out.println("Number can not be divided by zero");
   } 
}
}
