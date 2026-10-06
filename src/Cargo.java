public class Cargo {
    private long id;
    private long weight;
    private String address;

    public Cargo(long id, long weight, String address) {
        this.id = id;
        this.weight = weight;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public float getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "cargo{" +
                "id=" + id +
                ", weight=" + weight +
                ", address='" + address + '\'' +
                '}';
    }
}
