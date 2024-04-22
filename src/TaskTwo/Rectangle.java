package TaskTwo;

public class Rectangle extends Figure {
    private String name = "Прямоугольник";
    private double sideOneSize;
    private double sideTwoSize;
    private double perimeterSize;
    private double areaSize;

    public Rectangle(double sideOneSize, double sideTwoSize) {
        this.sideOneSize = sideOneSize;
        this.sideTwoSize = sideTwoSize;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getSideOneSize() {
        return sideOneSize;
    }

    public double getSideTwoSize() {
        return sideTwoSize;
    }

    @Override
    public double getAreaSize() {
        return perimeterSize;
    }

    @Override
    public double getSquareSize() {
        return areaSize;
    }

    @Override
    public void area() {
        perimeterSize = sideOneSize * 2 + sideTwoSize * 2;
    }

    @Override
    public void square() {
        areaSize = sideOneSize * sideTwoSize;
    }
}
