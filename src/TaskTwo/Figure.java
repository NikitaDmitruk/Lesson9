package TaskTwo;

public abstract class Figure {
    private String name;
    private double areaSize;
    private double squareSize;

    public String getName() {
        return name;
    }

    public double getAreaSize() {
        return areaSize;
    }

    public double getSquareSize() {
        return squareSize;
    }

    public abstract void area();

    public abstract void square();
}
