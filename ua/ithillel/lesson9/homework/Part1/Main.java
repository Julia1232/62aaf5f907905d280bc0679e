package ua.ithillel.lesson9.homework.Part1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> animals = new ArrayList<String>();
        animals.add("Dog");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Mouse");
        animals.add("Dog");
        animals.add("Mouse");
        animals.add("Dog");
        animals.add("Mouse");
        animals.add("Dog");

        List<Integer> numb = new ArrayList<>();
        numb.add(1);
        numb.add(2);
        numb.add(2);
        numb.add(2);

        String[] numb_2 = {"1", "2", "3", "4"};

        countOccurance(animals, "Dog");
        calOccurance(animals);
        findUnique(numb);
        findOccurance(animals);
        toList(numb_2);
    }

    public static void countOccurance(List<String> lst, String animal) {
        int occurrences = Collections.frequency(lst, animal);
        System.out.println(occurrences + " repeat " + animal);

    }

    public static void calOccurance(List<String> lst) {
        Set<String> distinct = new HashSet<>(lst);
        for (String s : distinct) {
            System.out.println(s + ": " + Collections.frequency(lst, s));
        }
    }

    public static void findUnique(List<Integer> lst) {
        Set<Integer> uniqueGas = new HashSet<Integer>(lst);
        System.out.println("Уникальных значений: " + uniqueGas.size());

    }

    public static void findOccurance(List<String> list) {
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
    public static void toList(String[] a) {
        List<String> list = Arrays.asList(a);
        System.out.println(list);
    }
}



