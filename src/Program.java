import java.sql.SQLOutput;
import java.util.HashMap;
public class Program {

    public static void printKeys(HashMap<String,String> hashmap){
        System.out.println(hashmap.keySet());

    }

    public static void printKeysWhere(HashMap<String,String> hashmap, String text){

        for(String anyString : hashmap.keySet()) {
            if(anyString.contains(text)) {
                System.out.println(anyString);
            }

            // if the key contains the given string
            // we retrieve the value related to it
            // and add it tot the set of books to be returned


        }

    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){

        for(String anyString : hashmap.keySet()) {
            if (anyString.contains(text)) {
                System.out.println(hashmap.get(anyString));
            }
        }
    }
}
