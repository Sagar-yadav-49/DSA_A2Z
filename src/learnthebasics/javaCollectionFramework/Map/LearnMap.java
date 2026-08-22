package learnthebasics.javaCollectionFramework.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LearnMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        // add key-value pair in map
        map.put("Sagar",49);
        map.put("Mayank",13);
        System.out.println(map);
        // remove
//        map.remove("Sagar");
//        System.out.println(map);
        // check if it contains any key
        System.out.println(map.containsKey("Sagar"));
        System.out.println(map.containsKey("Mayank"));


        // get value
        System.out.println(map.get("Mayank"));
        // Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
        System.out.println(map.getOrDefault("Mayank",10000));
        System.out.println(map.getOrDefault("Shubham",10000));


        //
//        System.out.println(map.keySet()); // return set of all key
        // or
        Set<String> keys=map.keySet();
        System.out.println(keys);

//        System.out.println(map.values()); // return set of all value
        // or
        Collection<Integer> values=map.values();
        System.out.println(values);

//        System.out.println(map.entrySet()); // return set of all key-values
        // or
        Set<Map.Entry<String,Integer>> entries=map.entrySet();
        System.out.println(entries);

        // traverse through complete map
        for(Map.Entry<String,Integer> entry:entries){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
        // traverse through only key
        for(String key:keys){
            System.out.println(key);
        }
        // traverse through values
        for(int value:values){
            System.out.println(value);
        }
    }
}