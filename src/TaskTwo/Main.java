package TaskTwo;

import java.text.DecimalFormat;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Figure[] figures = new Figure[5];
        double sum = 0;
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println("Массив состоит из следующих фигур:");
        for (int i = 0; i < figures.length; i++) {
            switch (random.nextInt(3)) {
                case 0 -> {
                    Triangle triangle = new Triangle(random.nextInt(2, 5), random.nextInt(3, 5), random.nextInt(4, 5));
                    triangle.area();
                    triangle.square();
                    figures[i] = triangle;
                    System.out.println(triangle.getName() + ": а = " + triangle.getSideOneSize() + "; b = " +
                            triangle.getSideTwoSize() + "; c = " + triangle.getSideThreeSize() + "; P = " +
                            triangle.getAreaSize() + "; S = " + df.format(triangle.getSquareSize()));
                }
                case 1 -> {
                    Circle circle = new Circle(random.nextInt(1, 5));
                    circle.area();
                    circle.square();
                    figures[i] = circle;
                    System.out.println(circle.getName() + ": r = " + circle.getRadius() + ";  P = " + df.format(circle.getAreaSize()) + "; S = " + df.format(circle.getSquareSize()));
                }
                default -> {
                    Rectangle rectangle = new Rectangle(random.nextInt(1, 5), random.nextInt(1, 5));
                    rectangle.area();
                    rectangle.square();
                    figures[i] = rectangle;
                    System.out.println(rectangle.getName() + ": а = " + rectangle.getSideOneSize() + "; b = " +
                            rectangle.getSideTwoSize() + "; P = " + rectangle.getAreaSize() + "; S = " +
                            rectangle.getSquareSize());
                }
            }
            sum = sum + figures[i].getAreaSize();
        }
        System.out.println("Сумма периметра всех фигур в массиве ∑P = " + df.format(sum));
    }
}
