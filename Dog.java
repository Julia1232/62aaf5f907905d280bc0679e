public class Dog extends Animal {
    public static void main(String[] args) {
        Dog Simon = new Dog();
        Simon.name = "Simon";
        Simon.dogRun(140);
        Simon.swim(5);
        int simonDog = 1;

        Dog Dex = new Dog();
        Dex.name = "Dex";
        Dex.dogRun(100);
        Dex.swim(7);
        int dexDog = 1;
    }

    public static void swim(int m) {
        if (m < 10) {
            System.out.println(name + " swimming " + m);
        } else {
            System.out.println("Неправильный результат");
        }
    }
}
