package Project;
//Discount Class
//Static methods:
//getPizzaDiscountRate(String memberType)
//getDrinkDiscountRate(String memberType)

public class Discount {
    public static double getPizzaDiscountRate(String memberType) {
        if (memberType.equalsIgnoreCase("Premium")) {
            return 0.2;
        } else if (memberType.equalsIgnoreCase("Gold")) {
            return 0.15;
        } else if (memberType.equalsIgnoreCase("Silver")) {
            return 0.1;
        } else {
            return 0.0;
        }
    }


    public static double getDrinkDiscountRate(String memberType) {
        if (memberType.equalsIgnoreCase("Premium")) {
            return 0.1;
        } else if (memberType.equalsIgnoreCase("Gold")) {
            return 0.08;
        } else if (memberType.equalsIgnoreCase("Silver")) {
            return 0.05;
        } else {
            return 0.0;
        }
    }


}
