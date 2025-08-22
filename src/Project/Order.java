package Project;

import java.time.LocalDate;

/*Order Class
Fields: Customer customer, LocalDate date, double pizzaCost, double drinkCost
Methods:
setPizzaCost(double) – throws exception if negative
setDrinkCost(double) – throws exception if negative
getFinalPizzaCost(), getFinalDrinkCost()
getTotalCost(), toString()*/
public class Order {
    private Customer customer;
    private LocalDate date;
    private double pizzaCost;
    private double drinkCost;

    public Order(Customer customer ,LocalDate date){
        this.customer=customer;
        this.date=date;

    }
    public void setPizzaCost(double pizzaCost) throws IllegalAccessException {
        if(pizzaCost < 0){
            throw new IllegalAccessException("Pizza cost cant negative ");
        }
        this.pizzaCost=pizzaCost;
    }
    public void setDrinkCost(double drinkCost) {
        if (drinkCost < 0) {
            throw new IllegalArgumentException("Drink cost cannot be negative");
        }
        this.drinkCost = drinkCost;

    }
    public double getFinalPizzaCost() {
        double discount = Discount.getPizzaDiscountRate(customer.getMemberType());
        return pizzaCost - (pizzaCost * discount);
    }
    public double getFinalDrinkCost() {
        double discount = Discount.getDrinkDiscountRate(customer.getMemberType());
        return drinkCost - (drinkCost * discount);
    }

    public double getTotalCost() {
        return getFinalPizzaCost() + getFinalDrinkCost();
    }
    public String toString() {
        return "====== BILL =======" +
                customer + "\n" +
                "Order Date: " + date + "\n" +
                "Pizza Cost: ₹" + pizzaCost + "\n" +
                "Drink Cost: ₹" + drinkCost + "\n" +
                "Final Pizza Cost: ₹" + getFinalPizzaCost() + "\n" +
                "Final Drink Cost: ₹" + getFinalDrinkCost() + "\n" +
                "Total Bill: ₹" + getTotalCost() + "\n";
    }


}
