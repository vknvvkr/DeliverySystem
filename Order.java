public class Order {
    private String productName;
    private double amount;
    private DeliveryStrategy deliveryStrategy;

    public Order(String productName, double amount, DeliveryStrategy deliveryStrategy) {
        this.productName = productName;
        this.amount = amount;
        this.deliveryStrategy = deliveryStrategy;
    }

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public double getDeliveryCost() {
        return deliveryStrategy.calculateCost(amount);
    }

    public double getTotalCost() {
        return amount + getDeliveryCost();
    }

    public void printOrderDetails() {
        System.out.println("Товар: " + productName);
        System.out.println("Сумма товара: " + amount + " тенге");
        System.out.println("Способ доставки: " + deliveryStrategy.getDeliveryName());
        System.out.println("Стоимость доставки: " + getDeliveryCost() + " ₸");
        System.out.println("Итого к оплате: " + getTotalCost() + " тенге");
    }
}
