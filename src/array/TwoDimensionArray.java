package array;

public class TwoDimensionArray {
    public static void main(String[] args) {
        int a[][]=new int[3][2];  //3 row and 2 column.
        a[0][0]=10;
        a[0][1]=20;

        a[1][0]=30;
        a[1][1]=40;

        a[2][0]=50;
        a[2][1]=60;

       /* for(int i=0;i<=2;i++) ///for incrementing the rows.
        {
            for(int j=0;j<=1;j++){
                System.out.print(a[i][j]+"  ");

            }
            System.out.println();
        }*/
        for(int i[]:a){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
