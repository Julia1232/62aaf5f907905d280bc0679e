package ua.ithillel.lesson9.figures;

public class Foursquare implements Square {
    public static double areaFoursquare;
    public Foursquare(double areaFoursquare) {
        this.areaFoursquare = areaFoursquare * 4;
    }

    public void getArea() {
        System.out.println("Foursquare = " + this.areaFoursquare);

    }
}
