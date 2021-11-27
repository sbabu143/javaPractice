package operators;

public class Assignment {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a+=5); //a=a+5
        System.out.println(a-=5);  //a=a-5
        System.out.println(a*=5);  //a=a*5
        System.out.println(a/=5);  //a=a/5
        System.out.println(a%=5);  //a=a%5
        System.out.println(a&=5);  //a=a&5
        System.out.println(a|=5); //a=a|5

        //increment/decrement Operators
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
    }



}
