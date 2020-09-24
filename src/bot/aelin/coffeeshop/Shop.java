package bot.aelin.coffeeshop;

public class Shop {

    public static void main(String[] args) {

        ShopSystem shopSystem = new ShopSystem();

        Barista Tomass = new Barista();
        shopSystem.addObserver(Tomass);

        OrderBuilder coffeeOrder = new OrderBuilder();
        coffeeOrder.addCoffee("Cappuccino", 2);

        OrderBuilder cakeOrder = new OrderBuilder();
        cakeOrder.addCake("Strawberry Shortcake", 10);

        shopSystem.newOrder(coffeeOrder);
        shopSystem.newOrder(cakeOrder);

    }

}