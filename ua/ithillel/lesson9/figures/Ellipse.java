package ua.ithillel.lesson9.figures;

public class Ellipse implements Square{
    public static double areaEllipse;

    public Ellipse(double r) {
        this.areaEllipse = r * 3.14; }
    @Override
    public void getArea() {
        System.out.println("Ellipse = " + this.areaEllipse);
    }
}
