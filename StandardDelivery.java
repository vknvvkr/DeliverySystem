public class StandardDelivery implements DeliveryStrategy {
    @Override
    public double calculateCost(double orderAmount) {
        return 300.0;
    }

    @Override
    public String getDeliveryName() {
        return "Обычная доставка";
    }
}
