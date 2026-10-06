import java.awt.*;

public class DeliveryTicketServiceImpl implements DeliveryTicketService {
    @Override
    public DeliveryResponse ticket(DeliveryRequest deliveryRequest) {
        System.out.println(String.format("DELIVERY SERVICE : id from : %d, amount %d"));
        return new DeliveryResponse(11, DeliveryResponceType.SUCCESS);
    }


    /* @Override
    public PayResponse pay(PayRequest payRequest) {
        System.out.println(String.format("Pay service: ID from : %d, amount %d $ ", payRequest.getId(), payRequest.getAmount()));
        return new PayResponse(11, TypeResponse.SUCCESS);
    }*/

}
