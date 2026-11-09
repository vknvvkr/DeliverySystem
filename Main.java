public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("Смартфон", 150000.0, new StandardDelivery());
        order1.printOrderDetails();

        Order order2 = new Order("Ноутбук", 350000.0, new ExpressDelivery());
        order2.printOrderDetails();

        Order order3 = new Order("Книга", 5000.0, new PickupDelivery());
        order3.printOrderDetails();

        System.out.println("--- Смена способа доставки на Экспресс ---");
        order1.setDeliveryStrategy(new ExpressDelivery());
        order1.printOrderDetails();
    }
}
