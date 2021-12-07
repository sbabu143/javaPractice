package methods;

public class StringTest {

    public static void main(String[] args) {
        //String is an Object which represents sequence of character
        // 1.String literal

       //String s="Java Learning Academy";
       // String s1="Java Learning Academy";
        String s5="Good morning";
         //2.new memory allocate operator
        String s2=new String("Welcome");
        String s3=new String("Welcome");

        String s="Java Learning Academy";
        String[] splitString=s.split("Learning");
        System.out.println(splitString[0]);
        System.out.println(splitString[1]);
       //System.out.println(splitString[2]);
        System.out.println(splitString[1].trim());
        //for(int i=0;i<s.length();i++)
            for(int i=s.length()-1;i>=0;i--)//Reverse the String
            {
                System.out.print( s.charAt(i));
            }

    }
}
