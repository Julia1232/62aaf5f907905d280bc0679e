package ua.ithillel.lesson9.homework.Phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recording {
    private Map<String, List<String>> recording_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String name, String phone_number) {
        if (recording_hm.containsKey(name)) {
            phone_number_list = recording_hm.get(name);
            phone_number_list.add(phone_number);
            recording_hm.put(name, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            recording_hm.put(name, phone_number_list);
        }
    }

    public List<String> find(String name) {
        return recording_hm.get(name);
    }
}

