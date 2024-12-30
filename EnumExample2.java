public class EnumExample2 {
    public enum Season{
        WINTER,SUMMER,AUTUMN,RAINY;
    }
    public static void main(String[] args) {
        for (Season s : Season.values()) {
            System.out.println(s);
        }
    }
}
