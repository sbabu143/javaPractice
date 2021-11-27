package loopstatement;

public class StringMethods {
    public static void main(String[] args) {
        //REVERSE he string.
        /*java.lang.String s="gitlab";

        StringBuilder stbuilder=new StringBuilder(s);
        stbuilder.reverse();
        System.out.println(stbuilder);

        String alphabets="abcdefghijklmnopqrstuvwxyz";
        System.out.println("The length of alphabets is: " + alphabets.length());
        System.out.println("The index of F is: " + alphabets.indexOf('f'));
        System.out.println("The uppercase  of alphabets is: " + alphabets.toUpperCase());
        System.out.println("The alphabet at 10 position: " + alphabets.charAt(10));*/

        String s="HelloNareshbhai";

        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.indexOf('N'));
        System.out.println(s.charAt(10));

        String s1="hello";
        String s2="Nareshbhai";
        String s3="HELLO";
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.contains("HEL"));
        System.out.println(s1.contains(("llo")));

         // SUBSTRING
        // 0 1 2 3 4 5 6---->starting index
        // W E L C O M E
        // 1 2 3 4 5 6 7----->Ending Index

        String A="HelloNamaste";
        System.out.println(A.substring(0,5));
        System.out.println(A.substring(5,12));
        System.out.println(A.replace("Hello","Bolo"));


    }

}
