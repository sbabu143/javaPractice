package array;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        int[] arr2={10,20,30,40,50,60,70,80,90,100};

        for (int i=0; i<arr2.length; i++){
            if (arr2[i] % 3==0)
            {
                System.out.println(arr2[i]);
                break;
            }
            else
            {
                System.out.println(arr2[i] + " is not multiple of 3");
            }

            ArrayList<String> a=new ArrayList<>();
            a.add("magan");
            a.add("chhagan");
            a.add("Gagan");
            System.out.println(a.size());
            System.out.println(a.get(1));

        }





    }

}






