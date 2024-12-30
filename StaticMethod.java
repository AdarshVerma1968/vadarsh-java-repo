public class StaticMethod {
    int rollno;
    String name;
    String college;
    static void display(){
        String college = "TOCE";
    }
    StaticMethod(int r,String n){
        rollno = r;
        name = n;
    }
    void College(){
        System.out.println(rollno + " " + name + " " + college);
    }
    public static void main(String[] args) {
        StaticMethod m = new StaticMethod(6, "adarsh");
        StaticMethod m2 = new StaticMethod(77, "sachin");
        m.College();
        m2.College();
    }
}
