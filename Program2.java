public class Program2 {
    public static void main(String[] args) {
        int fact=1,i=1;
        while(i<=10){
            System.out.println(i + "!=" + (fact=fact*i));
            i++;
        }
    }
}