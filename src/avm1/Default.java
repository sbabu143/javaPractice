package avm1;

class A{
    int i=20;
    void My1(){
        System.out.println(i);
    }

public static class Default {
    public static void main(String[] args) {
        A obj1=new A();
        obj1.My1(); //
    }
    }
}
