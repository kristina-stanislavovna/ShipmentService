public class Adapter implements DeliveryTicketService {
    private CargoService cargoService;

    public Adapter(CargoService cargoService) {
        this.cargoService = cargoService;

    }

    public CargoService getCargoService() {
        return cargoService;
    }

    @Override
    public DeliveryResponse ticket(DeliveryRequest deliveryRequest) {
        CargoRequest cargoRequeste = new CargoRequest(
                (int) deliveryRequest.getId(),
                (int) deliveryRequest.getAmount()
        );
        CargoResponse cargoResponse = cargoService.cargoResponce(cargoRequeste);
        DeliveryResponse deliveryResponse = new DeliveryResponse(Integer.parseInt(cargoResponse.getId()), DeliveryResponceType.SUCCESS);
        return null;
    }



    /*
    @Override
    public PayResponse pay(PayRequest payRequest) {
        ClickRequest clickRequest = new ClickRequest(
                (int) payRequest.getId(),
                (int) payRequest.getAmount()
        );
        ClickResponse clickResponse = clickService.pay(clickRequest);
        PayResponse payResponse = new PayResponse(clickResponse.getId(), TypeResponse.SUCCESS);

        return payResponse;
    }*/
}




