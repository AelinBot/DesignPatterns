package bot.aelin.coffeeshop;

public class Shop {

    public static void main(String[] args) {

        ShopSystem shopSystem = new ShopSystem();

        CoffeeOrder coffee = new CoffeeOrder();
        coffee.coffee();

        CoffeeOrder cupcake = new CoffeeOrder();
        cupcake.cupcake();

        Barista Tomass = new Barista();

        shopSystem.addObserver(Tomass);

        shopSystem.newOrder(coffee);
        shopSystem.newOrder(cupcake);

    }

}
