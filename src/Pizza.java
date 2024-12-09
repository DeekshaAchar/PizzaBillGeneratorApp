public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsAdded = 150;
    private int backPack = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedforTakeaway = false;


    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }
    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }
    public void addExraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppingsAdded;
    }
    public void takeAway() {
        this.price += backPack;
    }
    public void getBill() {
        String bill = "";
        System.out.println("Pizza: " + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "Extra cheese added: " + extraCheesePrice + "\n";
        }
        if(isExtraToppingsAdded) {
            bill += "Extra Toppings added: " + extraToppingsAdded + "\n";
        }
        if(isOptedforTakeaway) {
            bill += "Opted for take away: " + backPack + "\n";
        }
        bill += "Bill: " + this.price + "\n";
        System.out.println(bill);
    }
}
