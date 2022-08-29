package ua.ithillel.lesson9.homework.Part1;

import java.util.*;

public class CalcOccurance {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Dog");
        list.add("Dog");
        list.add("Cat");
        list.add("Frog");
        list.add("Mouse");
        list.add("Cat");
        Set<String> distinct = new HashSet<>(list);
        for (String s : distinct) {
            System.out.println(s + ": " + Collections.frequency(list, s));
        }
    }
}
