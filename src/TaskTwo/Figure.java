package TaskTwo;

public abstract class Figure {
    private String name;
    private double perimeterSize;
    private double areaSize;

    public String getName() {
        return name;
    }

    public double getAreaSize() {
        return perimeterSize;
    }

    public double getSquareSize() {
        return areaSize;
    }

    public abstract void area();

    public abstract void square();
}
