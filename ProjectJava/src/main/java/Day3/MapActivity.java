package Day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapActivity {
    public static void main(String[] args) {

        // 1 - Type code to create a HashMap of key-value pairs
        // where key is id of type String and value is a name
        Map<String,String> keyValue= new HashMap<>();
        keyValue.put("101", "Smrithy");
        keyValue.put("102", "Francis");
        keyValue.put("103", "Johaan");

        // 2 - Call print method to print the map passed as its parameter.
            MapActivity activity=new MapActivity();
            activity.print(keyValue);
        // (Hint: Notice print() is a non-static method, so create an instance of MapActivity)

    }

    void print(Map map) {
        // 3 - Type code to print this map (keys and values)
        Set keys = map.keySet();
        for (Object key : keys) {
            System.out.println("Key: " + key + " | Value: " + map.get(key));
        }
    }
}
