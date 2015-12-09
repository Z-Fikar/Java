public class ArrayMatrix {
    public static void main(String[]args){
        int c[]= { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int d[][]=new int [5][2];
        for (int i=0;i<5;i++){
            for (int j=0;j<2;j++){
                d[i][j]=c[j+i*2];
                System.out.print(d[i][j] +" ");
            }
            System.out.println();
        }
    }
}
