package exceptionhandling;

public class UnCheckedException {
    public static void main(String[] args) {

        System.out.println("program started");
        //int i=10;
        //System.out.println(i/0);  //ArithmeticException--Unchecked

       String s=null;
       // System.out.println(s.length()); //NullPointer Exception

        String st="abcedf";        //"12345";
        //int i=Integer.parseInt(st);
        //System.out.println(i); // NumberFormat Exception

        int arr[]=new int[5];
        arr[10]=100;
        System.out.println(arr); //IndexOutOfBound Exception
    }
}
