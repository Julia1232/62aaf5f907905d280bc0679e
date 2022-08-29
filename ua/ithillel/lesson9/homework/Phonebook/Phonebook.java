package ua.ithillel.lesson9.homework.Phonebook;

public class Phonebook extends Recording {
    public static void main(String[] args) {
        Recording recording = new Recording();
        recording.add("Julia", "+380956271353");
        recording.add("Anna", "+380952171321");
        recording.add("Olga", "+380956275213");
        recording.add("Kate", "+380502514283");
        recording.add("Anastasia", "+380502521228");
        recording.add("Julia", "+380502263538");
        recording.add("Viktoria", "+380502527264");
        recording.add("Dmitro", "+380502521118");
        System.out.println("Julia " + recording.find("Julia"));
        System.out.println("Anna " + recording.find("Anna"));
        System.out.println("Kate " + recording.find("Kate"));
    }
}

