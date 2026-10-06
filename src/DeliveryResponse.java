public class DeliveryResponse {
    private int idTransaction;
    private DeliveryResponceType type;

    public DeliveryResponse(int idTransaction, DeliveryResponceType type) {
        this.idTransaction = idTransaction;
        this.type = type;
    }

    @Override
    public String toString() {
        return "DeliveryResponse{" +
                "idTransaction=" + idTransaction +
                ", type=" + type +
                '}';
    }
}
