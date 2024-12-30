public class Array2dDemo {
    public static void main(String[] args) {
        int[][] sample = new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                sample[i][j]=(i*4)+j+1;
                System.out.print(sample[i][j]+" ");
                System.out.println();
            }
        }
    }
}
