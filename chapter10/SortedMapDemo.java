import java.util.*;

public class SortedMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "11");
        map.put("3", "22");
        map.put("2", "33");
        SortedMap<String, String> sort = new TreeMap<String, String>(map);
        Set<Map.Entry<String, String>> entry1 = sort.entrySet();
        Iterator<Map.Entry<String, String>> it = entry1.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("after sorting: " + entry.getKey() + ",value: " + entry.getValue());
        }
    }
}
