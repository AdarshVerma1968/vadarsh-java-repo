public class MINMAX {
    public static void main(String[] args) {
        int[] num = {345,987,568,675,780};
        int min,max;
        min = num[0];
        max = num[0];
        for(int i=1;i<5;i++){
            if(num[i]<min){
                min = num[i];
            }
            if(num[i]>max){
                max = num[i];
            }
        }
        System.out.println("Min and Max : " +min+" "+max);
    }
}
