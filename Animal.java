public class Animal {
    static String name;

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
}
