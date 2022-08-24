public class Animal {
    static String name;

    public static String getName() {
        return name;
    }

    public static void catRun(int widthForCat) {
        if (widthForCat < 200) {
            System.out.println(name + " running " + widthForCat);
        } else {
            System.out.println("Неправильный результат");
        }
    }

    public static void dogRun(int widthForDog) {
        if (widthForDog < 200) {
            System.out.println(name + " running " + widthForDog);
        } else {
            System.out.println("Неправильный результат");
        }
    }

    public static void main(String[] args) {

        Cat Bars = new Cat();
        Bars.name = "Bars";
        Bars.catRun(44);


        Cat Soni = new Cat();
        Soni.name = "Soni";
        Soni.catRun(30);


        Dog Simon = new Dog();
        Simon.name = "Simon";
        Simon.dogRun(140);
        Simon.swim(5);


        Dog Dex = new Dog();
        Dex.name = "Dex";
        Dex.dogRun(100);
        Dex.swim(7);
    }
}

