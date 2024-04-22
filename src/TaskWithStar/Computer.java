package TaskWithStar;

import java.util.Objects;

public class Computer implements Cloneable {
    private String name;
    private String type;
    private Cpu cpu;

    public Computer(String name, String type, Cpu cpu) {
        this.name = name;
        this.type = type;
        this.cpu = cpu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(String name, double frequency, int cores) {
        cpu.setName(name);
        cpu.setFrequency(frequency);
        cpu.setCores(cores);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", cpu=" + cpu +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(name, computer.name) && Objects.equals(type, computer.type) && Objects.equals(cpu, computer.cpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, cpu);
    }

    @Override
    public Computer clone() throws CloneNotSupportedException {
        Computer clone = (Computer) super.clone();
        clone.cpu = (Cpu) cpu.clone();
        return clone;
    }
}
