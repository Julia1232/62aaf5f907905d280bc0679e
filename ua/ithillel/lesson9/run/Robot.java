package ua.ithillel.lesson9.run;

public class Robot implements Void {
    private final String name;

    public Robot(String name) {
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
