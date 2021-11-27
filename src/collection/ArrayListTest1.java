package collection;

import java.util.ArrayList;

public class ArrayListTest1 {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<String>();
        list.add("Amar");
        list.add("Akbar");
        list.add("Anthony");
        list.add("Jonny");
        list.add("Albert pinto");

        System.out.println("Number of elements is " + list.size());
        for(String R:list)
        {
            System.out.println(R);
        }
        //INSERTING elements in to array list
        list.add(2,"Sita");
        list.add(0,"Geeta");
        System.out.println("Number of elements after inserting is " + list.size());
        System.out.println("Elements in arraylist: "+ list);

        //REMOVING elements
        list.remove("Geeta");
        list.remove("Albert pinto");
        System.out.println("Number of elements after removing is " + list.size());
        System.out.println("Elements in arraylist: "+ list);

    }
}

