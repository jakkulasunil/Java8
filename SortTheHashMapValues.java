import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByValue;

public class SortTheHashMapValues {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Java", 2);
        hashMap.put("Hibernate", 1);
        hashMap.put("C", 4);
        hashMap.put("Spring", 5);
        hashMap.put("Microservices", 3);

        Stream<Map.Entry<String, Integer>> set = hashMap.entrySet().stream().sorted(comparingByValue());
        set.forEach(System.out::println);
    }
}
