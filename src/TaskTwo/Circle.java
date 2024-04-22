package TaskTwo;

public class Circle extends Figure {
    private String name = "Круг";
    private double radius;
    private double perimeterSize;
    private double areaSize;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getAreaSize() {
        return perimeterSize;
    }

    @Override
    public double getSquareSize() {
        return areaSize;
    }

    public void area() {
        perimeterSize = 2 * radius * Math.PI;
    }

    public void square() {
        areaSize = Math.pow(radius, 2) * Math.PI;
    }
}
