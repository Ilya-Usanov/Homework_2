
public class Order {
    public static void main(String[] args) {
        CoffeeHouse john = new CoffeeHouse(500, Preference.AMERICANO);
        CoffeeHouse any = new CoffeeHouse(501, Preference.CAPPUCHINO);
        CoffeeHouse joseph = new CoffeeHouse(49, Preference.LATTE);
        john.setPreference();
        any.setPreference();
        joseph.setPreference();
    }
}
