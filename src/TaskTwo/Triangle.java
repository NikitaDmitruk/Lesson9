package TaskTwo;

public class Triangle extends Figure {
    private String name = "Треугольник";
    private double sideOneSize;
    private double sideTwoSize;
    private double sideThreeSize;
    private double perimeterSize;
    private double areaSize;

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
        return perimeterSize;
    }

    @Override
    public double getSquareSize() {
        return areaSize;
    }

    public double getSideThreeSize() {
        return sideThreeSize;
    }

    @Override
    public void area() {
        perimeterSize = sideOneSize + sideTwoSize + sideThreeSize;
    }

    @Override
    public void square() {
        areaSize = Math.sqrt((perimeterSize / 2) * ((perimeterSize / 2) - sideOneSize) * ((perimeterSize / 2) - sideTwoSize) * ((perimeterSize / 2) - sideThreeSize));
    }
}
