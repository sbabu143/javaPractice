package exceptionhandling;

public class TryCatchFinally {
    public static void main(String[] args) {
        int arr[] = new int[5];

        try {
            arr[10] = 100;
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println(a.getMessage()); //IndexOutOfBound Exception
        }
        finally {
            System.out.println("This is finally block");
        }
    }
}