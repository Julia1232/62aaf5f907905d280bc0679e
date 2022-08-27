package ua.ithillel.lesson9.run;

public class Participant {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Jon");
        //cat1.run().treadmill();
        Human human1 = new Human("Bob");
        Robot robot1 = new Robot("X");
        cat1.run();
        cat1.jump();
        human1.run();
        human1.jump();
        robot1.run();
        robot1.jump();
    }
}
