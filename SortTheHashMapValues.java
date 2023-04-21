import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.Map.*;

public class SortTheHashMapValues {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Java", 5);
        hashMap.put("Hibernate", 1);
        hashMap.put("C", 4);
        hashMap.put("Spring", 2);
        hashMap.put("Microservices", 3);

        Stream<Map.Entry<String, Integer>> set = hashMap.entrySet().stream().sorted(Entry.comparingByValue());
        set.forEach(System.out::println);
    }
}
