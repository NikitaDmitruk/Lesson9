package TaskTwo;

public class Triangle extends Figure {
    private String name = "Треугольник";
    private double sideOneSize;
    private double sideTwoSize;
    private double sideThreeSize;
    private double areaSize;
    private double squareSize;

    public Triangle(double sideOneSize, double sideTwoSize, double sideThreeSize) {
        this.sideOneSize = sideOneSize;
        this.sideTwoSize = sideTwoSize;
        this.sideThreeSize = sideThreeSize;
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

    public double getSideThreeSize() {
        return sideThreeSize;
    }

    @Override
    public void area() {
        areaSize = sideOneSize + sideTwoSize + sideThreeSize;
    }

    @Override
    public void square() {
        squareSize = Math.sqrt((areaSize / 2) * ((areaSize / 2) - sideOneSize) * ((areaSize / 2) - sideTwoSize) * ((areaSize / 2) - sideThreeSize));
    }
}
