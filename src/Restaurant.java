public class Restaurant {

    public boolean findFood(String foodItem){
        System.out.println("Restaurant: Checking availability for: " + foodItem);
        if (foodItem == null || foodItem.isEmpty()) {
            return false;
        }
        System.out.println("Item found!");
        return true;
    }


    public void prepareOrder(String orderID, String foodItem){
        System.out.println("Restaurant: Preparing order: " + orderID + " - " + foodItem);
    }
}
