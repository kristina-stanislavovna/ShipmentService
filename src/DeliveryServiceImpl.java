import java.util.List;

public class DeliveryServiceImpl implements DeliveryService {

    private Order order;

    public DeliveryServiceImpl(Order order) {
        this.order = order;
    }


    @Override
    public String send(Order order) {
        String s = "Id STICK: " + order.getOrderId();
        return s;
    }
}
