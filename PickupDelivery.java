public class PickupDelivery implements DeliveryStrategy {
    @Override
    public double calculateCost(double orderAmount) {
        return 0.0;
    }

    @Override
    public String getDeliveryName() {
        return "Самовывоз";
    }
}
