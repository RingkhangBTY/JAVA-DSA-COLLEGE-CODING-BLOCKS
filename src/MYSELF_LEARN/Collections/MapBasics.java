package MYSELF_LEARN.Collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapBasics {
    public static void main(String[] args) {
        Map<String,Integer> students = new TreeMap<>();

        students.put("Ringkhang",32);
        students.put("Rahul",34);
        students.put("Riya",43);
        students.put("Saluke",89);
        students.put("Anand",39);

//        System.out.println(students.keySet());

//        for (String key: students.keySet()){
//            System.out.println(key+": "+students.get(key));
//        }

        String names = students.
                keySet().stream().
                map(key-> key+": "+students.get(key)).
                collect(Collectors.joining("\n"));

        System.out.println(names);
    }
}
