package bot.aelin.coffeeshop;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class ShopSystem extends Observable {

    private ArrayList<Observer> baristas = new ArrayList<>();

    public void newOrder(CoffeeOrder coffeeOrder) {
        String newOrder = coffeeOrder.getOrderName();
        notifyObservers(coffeeOrder.getOrderName());
    }

    public void notifyObservers(String coffeeOrder) {
        for(Observer barista : baristas) {
            barista.update(this, coffeeOrder);
        }
    }

    @Override
    public synchronized void addObserver(Observer o) {
        this.baristas.add(o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        this.baristas.remove(o);
    }

}
