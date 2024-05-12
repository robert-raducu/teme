package Tema22_23;

//Finding Common Entries in Two HashMaps
//
//Description:
//Create a class named HashMapComplex. In this class, create a method named getCommonEntries which takes two HashMaps
//both with String keys and Integer values as parameters. The method should return a new HashMap containing only the entries
//that exist in both input maps (i.e., the keys are present in both maps and associated with the same values in both maps).


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapComplex {

    public static Map<String, Integer> getCommonEntries(Map<String, Integer> map1, Map<String,Integer> map2){

        Map<String, Integer> commonEntries = new HashMap<>();
        for(Map.Entry<String,Integer> buffer : map1.entrySet()){
            String key = buffer.getKey();
            Integer value = buffer.getValue();
            if(map2.containsKey(key) && Objects.equals(map2.get(key), value)){
                commonEntries.put(key,value);
            }
        }
        return commonEntries;
    }
}
