package ua.ithillel.lesson9.run;

public class Human implements Void, Let_ {
    private final String name;

    public Human(String name) {
        this.name = name;
    }
    public void run() {
        System.out.println(this.name + " running " + treadmill());
    }
    public void jump() {
        System.out.println(this.name + " jumping " + side());
    }
    public String treadmill() {
        return "treadmill";
    }
    public String side() {
        return "side";
    }
}
