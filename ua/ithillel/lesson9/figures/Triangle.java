package ua.ithillel.lesson9.figures;

public class Triangle implements Square {
    public static double areaTriangle;

    public Triangle(double c, double b, double a) {
        double p = a + b + c;
        this.areaTriangle = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public void getArea() {
        System.out.println("Triangle = " + this.areaTriangle);
    }
}
