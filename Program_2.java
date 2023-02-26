import java.util.HashMap;
import java.util.Map;

public class Program_2 {

    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("PM","Prime Minister");
        map.put("CM","Chief Minister");
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }

    }
}
