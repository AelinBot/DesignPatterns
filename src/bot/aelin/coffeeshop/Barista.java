package bot.aelin.coffeeshop;

import java.util.Observable;
import java.util.Observer;

public class Barista implements Observer {

    @Override
    public void update(Observable shopSystem, Object coffeeOrder) {
        System.out.println("There is a new order: " + coffeeOrder);
    }
}
