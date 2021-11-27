package array;

public class ArrayTest2
{
    public static void main(String[] args) {

        String s[]=new String[3];
        s[0]="Welcome";
        s[1]="to First";
        s[2]="java learning";

        System.out.println(s.length); //return length
        for(String i:s){
            System.out.println(i);
        }

    }


}
