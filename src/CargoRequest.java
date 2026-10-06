public class CargoRequest {
    private long id;
    private int amount;

    public CargoRequest(long id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CargoRequest{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }
}
