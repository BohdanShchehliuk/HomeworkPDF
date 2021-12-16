package TaskAdd;

public class Animal {
    private String name;
    private int length;
    private int weight;

    public Animal() {
        this.name = name;
        this.length = length;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", weight=" + weight +
                '}';
    }
}
