public class StaticBlock {
    static{
        System.out.println("This block is invoked");
    }
    public static void main(String[] args) {
        StaticBlock s = new StaticBlock();
    }
}

