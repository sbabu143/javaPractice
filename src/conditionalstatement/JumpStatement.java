package conditionalstatement;

public class JumpStatement {
    public static void main(String[] args) {
        for (int i=8;i<=15;i++){

            if (i==10)
            {
               // break;
                continue;
            }

            System.out.println(i);
        }
    }
}
