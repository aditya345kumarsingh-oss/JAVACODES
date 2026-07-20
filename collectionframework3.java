import java.util.HashMap;
import java.util.Map;

public class collectionframework3 {
    public static void main(String[] args) {
        Map<String , String> maping = new HashMap<>();
        //for insertion use put keyword
        maping.put("in", "India");
        maping.put("u", "usa");
        maping.put("eng", "england ");
        System.out.println(maping);

        Map<String , String> mapping = new HashMap<>();
        mapping.put("br","brazil");
        System.out.println("before:"+ mapping);

        //if i use putall  then this key will add to first table 
        mapping.putAll(maping);
        System.out.println("after:"+ mapping);

        //putifabsent say if any entry is not there it will update
        mapping.putIfAbsent("is", "indiaa");

        // getordefault
        System.out.println(mapping.getOrDefault("u", "none"));

        // contain key __ tells key is present or not 
        System.out.println(mapping.containsKey("eng"));

        //contain value __ present or not 
         System.out.println(mapping.containsValue("eng"));

         // replace the value
         mapping.replace("in", "indo");
         System.out.println(mapping);

        //for removing 
        // mapping.remove("eng");
        // System.out.println(mapping);

        //for size 
        //   System.out.println(mapping.size());

    }
    
}
