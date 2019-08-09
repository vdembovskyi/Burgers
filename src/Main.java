public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("white", "pig", 5.58);
        hamburger.setAddition1("cheese", 1.4);
        hamburger.setAddition2("egge", 2.2);
        hamburger.setAddition3("sous", 3.2);
        hamburger.setAddition4("cheese2", 4.0);
        hamburger.getTotalPrice();

        HealthyBurger hamburger2 = new HealthyBurger("hen",20.00);
        hamburger2.setAddition5("cheese", 1.4);
        hamburger2.setAddition6("egge", 2.2);
        hamburger2.getTotalPrice();

        DeluxeHamburger hamburger3 = new DeluxeHamburger("bread","hen",20.00);
        hamburger3.getTotalPrice();

    }
}
