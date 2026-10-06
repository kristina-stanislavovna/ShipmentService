public class CargoResponse {
    private int id;
    private int amount;

    public CargoResponse(int id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "CargoResponse{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }
}
