package TaskTwo;

public class Rectangle extends Figure {
    private String name = "Прямоугольник";
    private double sideOneSize;
    private double sideTwoSize;
    private double areaSize;
    private double squareSize;

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
        return areaSize;
    }

    @Override
    public double getSquareSize() {
        return squareSize;
    }

    @Override
    public void area() {
        areaSize = sideOneSize * 2 + sideTwoSize * 2;
    }

    @Override
    public void square() {
        squareSize = sideOneSize * sideTwoSize;
    }
}
