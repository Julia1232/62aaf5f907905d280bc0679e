public class Dog extends Animal {
    public static int numb = 2;

    public static void swim(int m) {
        if (m < 10) {
            System.out.println(name + " swimming " + m);
        } else {
            System.out.println("Неправильный результат");
        }
    }
}
