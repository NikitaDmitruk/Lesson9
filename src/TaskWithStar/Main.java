package TaskWithStar;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Computer computer = new Computer("HP", "Laptop", new Cpu("Intel", 4.4, 8));
        Computer computer1 = computer.clone();
        System.out.println(computer);
        System.out.println(computer1);
        computer1.setCpu("AMD", 3.4, 4);
        System.out.println(computer);
        System.out.println(computer1);
    }
}
