public class EnumExample3 {
    public enum Season{
        WINTER,AUTUMN,SUMMER,RAINY;
    }
    public static void main(String[] args) {
     for (Season s : Season.values()) {
        System.out.println(s);
     }   
     Season s =  Season.valueOf("SUMMER");
     System.out.println(s);
    }
}
