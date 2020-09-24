package bot.aelin.coffeeshop;

import java.util.ArrayList;

public class ShopSystem {

    private ArrayList<Barista> baristas = new ArrayList<>();
    private ArrayList<CoffeeOrder> orders = new ArrayList<>();

    public void newOrder(CoffeeOrder coffeeOrder) {
        orders.add(coffeeOrder);
        notifyObservers(coffeeOrder.order.toString());
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
