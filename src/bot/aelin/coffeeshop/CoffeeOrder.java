package bot.aelin.coffeeshop;

public class CoffeeOrder {

    private String paymentMethod;
    private int price;
    private String customer;

    private String cake;
    private String cupcake;
    private String sandwich;
    private String coffee;
    private String tea;

    @Override
    public String toString() {
        return "New order!\n" +
                "Price of the order is: " + price + "\n" +
                "Items:"+ "\n" + "Cake: " + cake +
                " || Cupcake: " + cupcake +
                " || Sandwich: " + sandwich +
                " || Coffee: " + coffee +
                " || Tea: " + tea + "\n";
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCake() {
        return cake;
    }

    public void setCake(String cake) {
        this.cake = cake;
    }

    public String getCupcake() {
        return cupcake;
    }

    public void setCupcake(String cupcake) {
        this.cupcake = cupcake;
    }

    public String getSandwich() {
        return sandwich;
    }

    public void setSandwich(String sandwich) {
        this.sandwich = sandwich;
    }

    public String getCoffee() {
        return coffee;
    }

    public void setCoffee(String coffee) {
        this.coffee = coffee;
    }

    public String getTea() {
        return tea;
    }

    public void setTea(String tea) {
        this.tea = tea;
    }
}