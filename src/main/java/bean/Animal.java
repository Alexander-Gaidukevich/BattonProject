package bean;

public class Animal {
    private String name;
    private String collor;
    private int weight;

    public Animal(String name, String collor, int weight) {
        this.name = name;
        this.collor = collor;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollor() {
        return collor;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (weight != animal.weight) return false;
        if (!name.equals(animal.name)) return false;
        return collor.equals(animal.collor);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + collor.hashCode();
        result = 31 * result + weight;
        return result;
    }

    @Override
    public String toString() {
        return "bean.Animal{" +
                "name='" + name + '\'' +
                ", collor='" + collor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
