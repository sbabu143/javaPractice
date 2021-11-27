package conditionalstatement;

public class IfElse{
     void checkbalance(int balance){
        if (balance>1){
            System.out.println("access");
        }
        else {
            System.out.println("access denied");
        }
    }

    public static void main(String[] args) {
         IfElse bal=new IfElse();
         bal.checkbalance(5);


    }

    }
