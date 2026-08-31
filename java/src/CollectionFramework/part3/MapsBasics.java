package CollectionFramework.part3;

import java.util.HashMap;
import java.util.Map;

public class MapsBasics {
    static void main() {
        //HashMap<String,String> map = new HashMap<>();
        Map<String,String> map = new HashMap<>();
        //Map<String,String> map = new LinkedMap<>(); --> preserve order
        //Map<String,String> map = new TreeMap<>(); ---> sorted order maintainence

        //insertion
        map.put("in","India");
        //map.put("in","India2"); // ----> if key exists then updates the value, does not add new one
        map.put("en","England");
        map.put("us","United States");
        System.out.println("The map is : " + map);

        Map<String,String> m2 = new HashMap<>();
        m2.put("br","Brazil");
        System.out.println("Before m2 : "+m2);
        m2.putAll(map);
        System.out.println("After m2 : " + m2);

        //deletion
        m2.remove("en");
        System.out.println("Remove en : " + m2);

        //size
        System.out.println("Size of the map2 : "+m2.size());
        m2.clear();
        System.out.println("ClearED the map 2 : " + m2);

        //put if not present
        System.out.println("Map before : " + map);
        map.putIfAbsent("in","India3"); //------> since in already exists so it will not change the value
        map.putIfAbsent("is","Island");
        System.out.println("Map After : " + map);

        //retieval
        System.out.println("in corresponds to : " + map.get("in"));
        System.out.println("get usa else none : "+ map.getOrDefault("usa","NONE"));
        System.out.println("Map contains usa ? : " + map.containsKey("usa"));
        System.out.println("Map has India value ? : " + map.containsValue("India"));

        //replace
        System.out.println("Map now : " + map);
        map.replace("in","Indonesia");
        System.out.println("Map after replace : " + map);

        //keyset, values,get all entries
        System.out.println("Keysey of map : " + map.keySet()); // ----> Set of type string
        System.out.println("Valueset of map : " + map.values()); // ---> collection of type string
        System.out.println("Entry set of map : " + map.entrySet());

        //iterate over a map
        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
        }





    }
}
