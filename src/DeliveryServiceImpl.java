import java.util.List;

public class DeliveryServiceImpl implements DeliveryService {

    private List<Order> orders;

    public DeliveryServiceImpl(List<Order> orders) {
        this.orders = orders;
    }




    @Override
    public Order findById(int id) {
        String str = "";
        Order orderId = null;
        for (Order order : orders) {
            if (id == order.getOrderId()) {
                orderId = order;
                str = "<<<ticket dilevery>>> " + order.getOrderId();
                System.out.println(str);

            }
        }
        return orderId;
    }



}
