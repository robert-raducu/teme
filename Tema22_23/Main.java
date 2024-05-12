package Tema22_23;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Andrei",10);
        map1.put("Maria",20);
        map1.put("Vlad",50);
        map1.put("Ioana",2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Andrei",10);
        map2.put("Maria",100);
        map2.put("Vlad",50);
        map2.put("Bianca",30);

        //am facut metoda statica ca sa nu mai creez o instanta sa chem metoda
        Map<String,Integer> commonEntries = HashMapComplex.getCommonEntries(map1,map2);

        System.out.println("Common entries:");
        for (Map.Entry<String, Integer> entry : commonEntries.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
