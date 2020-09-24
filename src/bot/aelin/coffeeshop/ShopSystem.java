package bot.aelin.coffeeshop;

import java.util.ArrayList;

public class ShopSystem {

    private ArrayList<Barista> baristas = new ArrayList<>();
    private ArrayList<OrderBuilder> orders = new ArrayList<>();

    public void newOrder(OrderBuilder orderBuilder) {
        orders.add(orderBuilder);
        notifyObservers(orderBuilder.toString());
    }

    public void notifyObservers(String coffeeOrder) {
        for(Barista barista : baristas) {
            barista.update(coffeeOrder);
        }
    }

    public synchronized void addObserver(Barista o) {
        this.baristas.add(o);
    }

    public synchronized void deleteObserver(Barista o) {
        this.baristas.remove(o);
    }

}