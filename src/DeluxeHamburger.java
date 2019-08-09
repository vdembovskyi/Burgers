public class DeluxeHamburger extends Hamburger {

    public DeluxeHamburger(String breadType, String meat, double basePrice) {
        super(breadType, meat, basePrice);
        super.setAddition1("Drink", 10.00);
        super.setAddition2("chips", 5.00);
    }



}
