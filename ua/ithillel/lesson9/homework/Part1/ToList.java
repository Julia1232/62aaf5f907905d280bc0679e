package ua.ithillel.lesson9.homework.Part1;

import java.util.ArrayList;
import java.util.Arrays;

public class ToList {
    public static void main(String[] args) {
        ArrayList<Integer> days = new ArrayList<>();
        days.add(1);
        days.add(2);
        days.add(3);
        String[] daysArray = days.toArray(new String[days.size()]);
        System.out.println("Массив: " + Arrays.toString(daysArray));
    }
}
