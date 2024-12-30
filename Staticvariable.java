public class Staticvariable {
    int rollno;
    String name;
    static String college = "TOCE";
    Staticvariable(int r,String n){
        rollno = r;
        name = n;
    } 
    void College(){
        System.out.println(rollno + " " + name + " " + college);
    }
    public static void main(String[] args) {
        Staticvariable s1 = new Staticvariable(6, "Adarsh");
        Staticvariable s2 = new Staticvariable(77, "Sachin");
        s1.College();
        s2.College();
    }
}
