public class ExceptionExample {
    public static void main(String[] args) {
        try{
            int a = 5 ,b=0;
            System.out.println("Quotient = " + (a/b));
        }
        catch(ArithmeticException e){
            System.out.println("Number can not be divided by zero");
        }
    }
}
