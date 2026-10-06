public class Order {
    private int orderId;
    private double weightKg;
    private String deliveryAddress;

    public Order(int orderId, double weightKg, String deliveryAddress) {
        this.orderId = orderId;
        this.weightKg = weightKg;
        this.deliveryAddress = deliveryAddress;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", weightKg=" + weightKg +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                '}';
    }
}
