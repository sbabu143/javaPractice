package array;

public class ArraySum {
    public static void main(String[] args) {

       /* int a[] = new int[5]; //Declaration
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;*/
      /* for (int i=0;i<a.length;i++)
       {
            System.out.println(a[i]);
        }*/

        //For each Loop
        /*for (int i : a) {
            System.out.println(i);
        }*/
        int r[]={100,200,300,400,500};
        int sum=0;
        for(int p:r){
            System.out.println(p);
            sum=sum+p;
        }
        System.out.println("Sum of all the elements is " +sum);

    }
}