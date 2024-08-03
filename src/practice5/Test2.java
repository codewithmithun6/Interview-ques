package practice5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {

        HashMap<String, String> countryCapital = new HashMap<>();

        //populate the map
        countryCapital.put("USA", "Washington, D.C.");
        countryCapital.put("UK", "London");
        countryCapital.put("India", "New Delhi");

        Set<Map.Entry<String, String>> entries = countryCapital.entrySet();

        for (Map.Entry<String, String> entry: entries){
            System.out.println("Country: "+entry.getKey()+", Capital: "+entry.getValue());
        }


    }
}
