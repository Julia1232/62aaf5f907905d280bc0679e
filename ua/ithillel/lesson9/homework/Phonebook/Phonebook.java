package ua.ithillel.lesson9.homework.Phonebook;

import java.util.*;
public class Phonebook {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("julia - 096392645");
        list.add("ann - 096392645");
        list.add("nika - 096392645 ");
        list.add("olga - 096392645");

        find(list, "julia");
    }
    public static void find(List<String> lst, String name) {

        Iterator<String> itr = lst.iterator();
        while (itr.hasNext()) {
            String curr = itr.next();
            if (!curr.startsWith(name)) {
                itr.remove();
            }
        }
        System.out.println(lst);
    }
}






