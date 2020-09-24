package bot.aelin.coffeeshop;

public class OrderBuilder {

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

    public CoffeeOrder build() {
        CoffeeOrder coffeeOrder = new CoffeeOrder();
        coffeeOrder.setPaymentMethod(this.paymentMethod);
        coffeeOrder.setPrice(this.price);
        coffeeOrder.setCustomer(this.customer);
        coffeeOrder.setCake(this.cake);
        coffeeOrder.setCupcake(this.cupcake);
        coffeeOrder.setSandwich(this.sandwich);
        coffeeOrder.setCoffee(this.coffee);
        coffeeOrder.setTea(this.tea);
        return coffeeOrder;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void addCake(String cake, int price) {
        this.cake = cake;
        this.price += price;
    }

    public void addCupcake(String cupcake, int price) {
        this.cupcake = cupcake;
        this.price += price;
    }

    public void addSandwich(String sandwich, int price) {
        this.sandwich = sandwich;
        this.price += price;
    }

    public void addCoffee(String coffee, int price) {
        this.coffee = coffee;
        this.price += price;
    }

    public void addTea(String tea, int price) {
        this.tea = tea;
        this.price += price;
    }

}
