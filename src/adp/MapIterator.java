package adp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIterator {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1267, "Anant");
        map.put(1261, "Ram");
        map.put(1367, "Sita");
        map.put(207, "Hanuman");
        map.put(2267, "Pawan");
        map.put(4667, "Tom");

        //1st way
        for(Integer id : map.keySet()) {
            System.out.println(id.intValue());
        }

        System.out.println();

        for(String name: map.values()){
            System.out.println(name);
        }

        System.out.println("------------------------");

        //2nd way
        for(Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println("-------------------------");

        //3rd way

        Iterator<Map.Entry<Integer,String>> itr = map.entrySet().iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("------------------------");

        //4th way

        map.forEach((k,v) -> System.out.println(k +" => "+ v));

    }

}
