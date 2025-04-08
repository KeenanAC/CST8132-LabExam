public class PaymentGateway {

    public boolean verifyCard(String paymentDetails){
        System.out.println("Payment Gateway: Verifying card details...");
        if (paymentDetails == null){
            return false;
        }
        System.out.println("Success!");
        return true;
    }

    public boolean processPayment(String orderId, double amount){
        System.out.println("Payment Gateway: Processing payment of: $"+ amount +
                " for order: #" + orderId);
        if (orderId == null){
            System.out.println("Order ID not found!");
            return false;
        }

        System.out.println("Success!");
        return true;
    }


}
