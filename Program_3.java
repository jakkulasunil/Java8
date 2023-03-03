import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program_3 {
    private static List<String> listOfFruits=Arrays.asList("Banana","Apple","Kiwi","Grapes");

    public static void main(String[] args) {
        List<String> result=getFilterFruitsDetails(listOfFruits,"Banana");
        for(String fruit:result){
            System.out.println(fruit);
        }
    }

    public static List<String> getFilterFruitsDetails(List<String> fruits,String filter){
        List<String> listOfFruits=new ArrayList<>();
        for(String fruit:fruits){
            if(!"Banana".equals(fruit)){
                listOfFruits.add(fruit);
            }
        }
        return listOfFruits;
    }

}
