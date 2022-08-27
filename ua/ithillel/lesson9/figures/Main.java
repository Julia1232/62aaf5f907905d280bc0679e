package ua.ithillel.lesson9.figures;


public class Main {
    public static void main(String[] args) {

        Foursquare foursquare = new Foursquare(40);
        Triangle triangle = new Triangle(5, 5, 3);
        Ellipse ellipse = new Ellipse(3);

        foursquare.getArea();
        triangle.getArea();
        ellipse.getArea();

        double myArray[] = {Foursquare.areaFoursquare, Triangle.areaTriangle, Ellipse.areaEllipse};
        double sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println("суммарная площадь фигур - " + sum);
    }
}

