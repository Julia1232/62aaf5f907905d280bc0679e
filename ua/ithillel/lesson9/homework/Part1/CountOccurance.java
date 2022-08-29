package ua.ithillel.lesson9.homework.Part1;

import java.util.ArrayList;
import java.util.Collections;

public class CountOccurance {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Dog");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Mouse");
        animals.add("Dog");
        animals.add("Mouse");
        animals.add("Dog");
        animals.add("Mouse");
        animals.add("Dog");
        int occurrences = Collections.frequency(animals, "Dog");
        System.out.println(occurrences);
    }
}
