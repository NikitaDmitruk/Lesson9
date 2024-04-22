package TaskWithStar;

public class Cpu implements Cloneable {
    private String name;
    private double frequency;
    private int cores;

    public Cpu(String name, double frequency, int cores) {
        this.name = name;
        this.frequency = frequency;
        this.cores = cores;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                ", cores=" + cores +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
