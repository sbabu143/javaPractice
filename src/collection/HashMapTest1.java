package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest1 {
    public static void main(String[] args) {

        HashMap<Integer,String> hm=new HashMap<Integer,String>();

        hm.put(110,"Raja");
        hm.put(220,"Rani");
        hm.put(550,"Badshah");
        hm.put(440,"Begam");
        System.out.println(hm);
        System.out.println(hm.size());

        System.out.println(hm.get(440));

        for(Map.Entry m:hm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        hm.remove(110);
        System.out.println(hm);
        {

        }
    }
}
