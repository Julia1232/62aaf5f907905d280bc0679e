package ua.ithillel.lesson9.homework.Part1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindUnique {
    public static void main(String[] args) {
        ArrayList<Integer> numb = new ArrayList<>();
        numb.add(1);
        numb.add(2);
        numb.add(2);
        numb.add(2);
        Set<Integer> uniqueGas = new HashSet<Integer>(numb);
        System.out.println("Уникальных значений: " + uniqueGas.size());
    }
}
