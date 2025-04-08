public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        PaymentGateway paymentGateway = new PaymentGateway();
        DeliveryService deliveryService = new DeliveryService();

        OnlineOrderFacade onlineOrderFacade = new OnlineOrderFacade(restaurant, paymentGateway, deliveryService);

        onlineOrderFacade.placeOrder("Pizza", "1234-5678-9012-3456", "123 Main St");

    }
}
