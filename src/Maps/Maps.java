package Maps;

import java.util.HashMap;
import java.util.List;

public class Maps {
    public static void  main(String[] args){
        //A HashMap in Java is specifically designed to associate one key with one value. Therefore, it always requires exactly two type parameters:
        HashMap<String,Integer> empIds = new HashMap<>();

        empIds.put("Pravin",123);
        empIds.put("Vikas",124);
        empIds.put("Sameer",153);

        System.out.println(empIds);

        System.out.println(empIds.containsKey("Sameer"));

        System.out.println(empIds.get("Sameer"));

        empIds.remove("Vikas");
        System.out.println(empIds);

        empIds.put("Pravin",1010);
        System.out.println(empIds);

        empIds.put("Akash",1010);
        System.out.println(empIds);









    }
}
