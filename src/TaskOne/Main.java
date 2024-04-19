package TaskOne;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();
        boss.getPositionName();
        worker.getPositionName();
        accountant.getPositionName();
    }
}