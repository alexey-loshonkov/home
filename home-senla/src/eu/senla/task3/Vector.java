package eu.senla.task3;

public class Vector {

    private double x1, x2, y1, y2;

    public Vector(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    double sumVector(double startVector, double endVector) {
        double result = Math.sqrt(Math.pow(startVector,2) + (Math.pow(endVector,2)));
        return result;
    }

    double multipliedVectors(double x1x2, double y1y2) { // вектор произведения одного на второй
        return x1x2 * y1y2;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }
}
