package array;

public class ObjectArray {
    public static void main(String[] args) {

       // Object[] a = new Object[5];
        Object a[]={20,20.5,"Arraylist",'A',true};

       // a[0] = 20;   //integer
        //a[1] = 30.5; //double
        //a[2] = "ArrayObject";  //String
        //a[3] = 'A'; //char
       // a[4] = true; //boolean

        for (Object i : a) {
            System.out.println(i);
        }
    }

}
