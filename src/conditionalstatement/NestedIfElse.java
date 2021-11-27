package conditionalstatement;

public class NestedIfElse {
    public static void agelimit(int r){
        if (r<=20)
        {
            System.out.println("falls under child condition");
        }
        else if (r>=21 && r<=50)
        {
            System.out.println("Falls under healthy working condition");
        }
        else if(r>=51 && r<=75)
        {
            System.out.println("Falls under retirement condition");
        }
        else
        {
            System.out.println("Falls under senior citizen condition");
        }

    }

    public static void main(String[] args) {
        agelimit(18);
        agelimit(25);
        agelimit(60);
        agelimit(78);


    }
}
