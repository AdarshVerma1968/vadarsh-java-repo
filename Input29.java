import java.util.*;
public class Input29 {
    public static void main(String[] args) {
        int i=1;
        while(i<=100){
            if(i>=51 && i<=75){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
