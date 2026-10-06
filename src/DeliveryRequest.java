public class DeliveryRequest {
    private int id;
    private int amount;

    public DeliveryRequest(int id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "DeliveryRequest{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }
}
