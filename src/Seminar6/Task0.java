package Seminar6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task0 {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> hashSet = new HashSet<>();
    }

    private static fillSet(Set<Integer> set) {
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        return set;


    }
}
