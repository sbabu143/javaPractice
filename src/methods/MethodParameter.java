package methods;

   public class MethodParameter {static int myMethod(int x, int y, int z)
{
    return x+y+z;
}
    public static void main(String[] args) {
        System.out.println(myMethod(5,6,4));
        System.out.println(myMethod(20,20,20));
    }

}
