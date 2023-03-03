import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program_3 {
    private static final List<String> listOfFruits=Arrays.asList("Banana","Apple","Kiwi","Grapes");

    public static void main(String[] args) {
        List<String> result=getFilterFruitsDetails(listOfFruits,"Banana");
        for(String fruit:result){
            System.out.println(fruit);
        }
        System.out.println("We are used streams and reduced the no.of lines of code");
        List<String> fruitsFilter = listOfFruits.stream()
                .filter(fruit -> !"Kiwi".equals(fruit))
                .collect(Collectors.toList());
        fruitsFilter.forEach(System.out::println);
    }
    //we will reduce the no.of lines of code using the java8
    public static List<String> getFilterFruitsDetails(List<String> fruits,String filter){
        List<String> listOfFruits=new ArrayList<>();
        for(String fruit:fruits){
            if(!filter.equals(fruit)){
                listOfFruits.add(fruit);
            }
        }
        return listOfFruits;
    }
}
