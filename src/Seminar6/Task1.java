package Seminar6;

import java.util.HashSet;

public class Task1 {


    public class Main {
        public static void main(String[] args) {

            HashSet<Integer> set = new HashSet<>();


            set.add(1);
            set.add(2);
            set.add(3);
            set.add(2);
            set.add(4);
            set.add(5);
            set.add(6);
            set.add(3);

            System.out.println("Содержимое множества: " + set);
        }
    }

}
