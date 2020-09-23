package bot.aelin.coffeeshop;

public class Shop {

    public static void main(String[] args) {

        ShopSystem shopSystem = new ShopSystem();

        CoffeeOrder cappuccino = new CoffeeOrder("Cappuccino");
        CoffeeOrder latte = new CoffeeOrder("Latte");

        Barista Tomass = new Barista();

        shopSystem.addObserver(Tomass);

        shopSystem.newOrder(cappuccino);
        shopSystem.newOrder(latte);

    }

}
