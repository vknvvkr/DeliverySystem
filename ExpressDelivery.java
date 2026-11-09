public class ExpressDelivery implements DeliveryStrategy {

    @Override
    public double calculateCost(double orderAmount) {
        return 200.0;
    }

    @Override
    public String getDeliveryName() {
        return "Экспресс-доставка";
    }
}