package TaskTwo;

public class Circle extends Figure {
    private String name = "Круг";
    private double radius;
    private double areaSize;
    private double squareSize;

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
        return areaSize;
    }

    @Override
    public double getSquareSize() {
        return squareSize;
    }

    public void area() {
        areaSize = 2 * radius * Math.PI;
    }

    public void square() {
        squareSize = Math.pow(radius, 2)*Math.PI;
    }
}
