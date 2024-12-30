public class ExceptionExample4 {
    public static void main(String[] args) {
        try{
            int a=5,b=0;
            System.out.println("Quotient = " + (a/b));
        }
        catch(ArithmeticException e){
            System.out.println("Caught Exception : " + e.getMessage());
        }
        finally{
            System.out.println("Finally block executed");
        }
    }
}
