public class HealthyBurger extends Hamburger {
    private String addition5;
    private String addition6;
    private double additionPrice5;
    private double additionPrice6;

    public HealthyBurger(String meat, double basePrice) {
        super("brown", meat, basePrice);
    }

    public String getAddition5() {

        return addition5;
    }

    public void setAddition5(String addition5, double additionPrice5) {
        this.addition5 = addition5;
        this.additionPrice5 = additionPrice5;
    }

    public String getAddition6() {

        return addition6;
    }

    public void setAddition6(String addition6, double additionPrice6) {
        this.addition6 = addition6;
        this.additionPrice6 = additionPrice6;
    }

    public double getAdditionPrice5() {

        return additionPrice5;
    }

    public double getAdditionPrice6() {

        return additionPrice6;
    }

    public void getTotalPrice() {
        System.out.println("The total price is: " + "\n"
                + "base price: " + getBasePrice() + "\n"
                + "price for addition1 " + getAdditionPrice1() + "\n"
                + "price for addition2 " + getAdditionPrice2() + "\n"
                + "price for addition3 " + getAdditionPrice3() + "\n"
                + "price for addition4 " + getAdditionPrice4() + "\n"
                + "price for addition5 " + getAdditionPrice5() + "\n"
                + "price for addition6 " + getAdditionPrice6() + "\n"
                + " = " + (getBasePrice() + getAdditionPrice1() + getAdditionPrice2() + getAdditionPrice3() + getAdditionPrice4()));
    }

}
