package bean;

public class Car {
    private String marc;
    private String collor;
    private int cost;

    public Car(String marc, String collor, int cost) {
        this.marc = marc;
        this.collor = collor;
        this.cost = cost;
    }

    public String getMarc() {
        return marc;
    }

    public void setMarc(String marc) {
        this.marc = marc;
    }

    public String getCollor() {
        return collor;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (cost != car.cost) return false;
        if (!marc.equals(car.marc)) return false;
        return collor.equals(car.collor);

    }

    @Override
    public int hashCode() {
        int result = marc.hashCode();
        result = 31 * result + collor.hashCode();
        result = 31 * result + cost;
        return result;
    }

    @Override
    public String toString() {
        return "bean.Car{" +
                "marc='" + marc + '\'' +
                ", collor='" + collor + '\'' +
                ", cost=" + cost +
                '}';
    }
}
