public class OnlineOrderFacade {

    private Restaurant restaurant;
    private PaymentGateway paymentGateway;
    private DeliveryService deliveryService;

    public OnlineOrderFacade(Restaurant restaurant, PaymentGateway paymentGateway, DeliveryService deliveryService) {
        this.restaurant = restaurant;
        this.paymentGateway = paymentGateway;
        this.deliveryService = deliveryService;

    }

    public void placeOrder(String foodItem, String paymentDetails, String address){
        System.out.println("=== Placing order ===");
        System.out.println("Facade: Placing order for: " + foodItem);
        System.out.println();

        if (!restaurant.findFood(foodItem)) {
            System.out.println(foodItem + " is unavailable please try again.");
            System.exit(0);
        }
        System.out.println();
        if (!paymentGateway.verifyCard(paymentDetails)) {
            System.out.println(paymentDetails + " has not been accepted. Please try again.");
            System.exit(0);
        }
        System.out.println();

        if (!paymentGateway.processPayment(String.valueOf(System.currentTimeMillis()), 15.00)) {
            System.out.println(paymentDetails + " has not been accepted. Please try again.");
        }
        System.out.println();

        restaurant.prepareOrder(String.valueOf(System.currentTimeMillis()), foodItem);
        System.out.println();

        deliveryService.assignDriver(String.valueOf(System.currentTimeMillis()), address);
        System.out.println("=== Order Placed! ===");
    }

}
