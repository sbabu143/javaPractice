package array;

public class LargestSmallestNumber {
    public static void main(String[] args) {
        
        int[] Lar=new int[]{10,20,30,40,50};
        
        int max=Lar[0];
        
        for(int i=0;i<Lar.length;i++){

            if(Lar[i]>max)
                max=Lar[i];
        }
        System.out.println("Largest Number is: "+max);

        int[] sma=new int[]{10,20,30,40,50};
        int min=sma[0];
        for (int i=0;i<sma.length;i++){
            if(sma[i]<min)
                min=sma[i];
        }
        System.out.println("Smallest Number is: "+min);
    }
}
