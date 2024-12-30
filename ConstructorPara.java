public class ConstructorPara {
    ConstructorPara(){
        System.out.println("Welcome");
    }
    ConstructorPara(String name){
        System.out.println("Welcome " + name);
    }
    public static void main(String[] args) {
        ConstructorPara p1 = new ConstructorPara();
        ConstructorPara p2 = new ConstructorPara("Adarsh");
    }
}
