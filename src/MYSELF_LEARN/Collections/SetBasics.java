package MYSELF_LEARN.Collections;

import java.util.*;

public class SetBasics {
    public static void main(String[] args) {

//        Set<Integer> values = new HashSet<>(); // doesn't maintain indentation
//        Set<Integer> values = new TreeSet<>(); // sorted order

        Collection<Integer> values = new LinkedHashSet<>(); // maintain indentation

        values.add(12);
        values.add(32);
        values.add(34);
        values.add(143);
        values.add(19);

        Iterator<Integer> iterator = values.iterator();

//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println(iterator.next());

        for (int n : values){
            System.out.println(n);
        }

    }
}