package bot.aelin.coffeeshop;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrder implements Options {

    List<String> order = new ArrayList<>();

    public CoffeeOrder(List<String> order) {
        this.order = order;
    }

    public CoffeeOrder() {

    }

    public List<String> getOrder() {
        return order;
    }

    @Override
    public void cake() {
        order.add("Cake");
    }

    @Override
    public void cupcake() {
        order.add("Cupcake");
    }

    @Override
    public void sandwich() {
        order.add("Sandwich");
    }

    @Override
    public void coffee() {
        order.add("Coffee");
    }

    @Override
    public void tea() {
        order.add("Tea");
    }
}
