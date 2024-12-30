import java.util.*;
public class Input30 {
    public static void main(String[] args) {
        for(char c='A';c<='z';c++){
            if(c>'Z' && c<'a'){
                continue;
            }
            System.out.println(c);
        }
    }
}
