package exceptionhandling;

public class HandleUnchecExep {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Start the program");

        try {
            System.out.println(i/0); //Arithmatic Exception

        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        String s=null;
        try {
            System.out.println(s.length()); //Null pointer
        } catch (NullPointerException n){
            System.out.println(n.getMessage());
        }
        System.out.println("continue Program");
        System.out.println("Complete the program");
    }
}
