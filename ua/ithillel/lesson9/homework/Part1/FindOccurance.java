package ua.ithillel.lesson9.homework.Part1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindOccurance {
    public static void countFrequencies(ArrayList<String> list) {
        Map<String, Integer> hm = new HashMap<String, Integer>();
        for (String i : list) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }
        for (Map.Entry<String, Integer> val : hm.entrySet()) {
            System.out.println("Element " + val.getKey() + " "
                    + "occurs"
                    + ": " + val.getValue() + " times");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Frog");
        list.add("Frog");
        list.add("Frog");
        list.add("Cat");
        list.add("Cat");
        list.add("Dog");
        list.add("Dog");
        countFrequencies(list);
    }
}