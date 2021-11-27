package avm1;

 //Only with in the class
class M{
    private int a=20;
    private void m1()
    {
        System.out.println(a);

    }
}
public class Private {
    public static void main(String[] args) {
        M Met1=new M();
     //   Met1.m1();      // cannot not access as it is private
        A obj2=new A();  // from default class it is access as in same package
        obj2.My1();
    }
}
