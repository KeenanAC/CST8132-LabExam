public class DeliveryService {

    public void assignDriver(String orderID, String address){
        System.out.println("Delivery Service: Assigning driver to order: " + orderID +
                " to address: " + address);
    }

    public String trackDelivery(String orderId){
        return orderId + " has been delivered!";
    }
}
