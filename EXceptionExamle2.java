public class EXceptionExamle2 {
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("not valid");
        }
        else{
            System.out.println("Welcome to vote");
        }
    }
    public static void main(String[] args) {
        validate(15);
        System.out.println("Rest of the code");
    }
}
