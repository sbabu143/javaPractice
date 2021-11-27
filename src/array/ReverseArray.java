package array;

public class ReverseArray {
    public static void main(String[] args) {

        int[]num={10,20,30,40,50,60,70,80,90,100};
        System.out.println("Length of this array is " + num.length );
        System.out.println("Real Order");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+ " ");
        }
        System.out.println();
        System.out.println("Reverse Order ");
        for(int i=num.length-1;i>=0;i--) //loop for reverse order
        {
            System.out.print(num[i]+ " ");
        }
    }
}
