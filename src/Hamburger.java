public class Hamburger {
    private String breadType;
    private String meat;
    private String addition1;
    private double additionPrice1;
    private String addition2;
    private double additionPrice2;
    private String addition3;
    private double additionPrice3;
    private String addition4;
    private double additionPrice4;
    private double basePrice;


    public Hamburger(String breadType, String meat, double basePrice) {
        this.breadType = breadType;
        this.meat = meat;
        this.basePrice = basePrice;
    }

    public void getTotalPrice() {
        System.out.println("The total price is: " + "\n"
                + "base price: " + getBasePrice() + "\n"
                + "price for addition1 " + getAdditionPrice1() + "\n"
                + "price for addition2 " + getAdditionPrice2() + "\n"
                + "price for addition3 " + getAdditionPrice3() + "\n"
                + "price for addition4 " + getAdditionPrice4() + "\n"
                + " = " + (getBasePrice() + additionPrice1 + additionPrice2 + additionPrice3 + additionPrice4));
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getAddition1() {

        return addition1;

    }

    public void setAddition1(String addition1, double additionPrice1) {
        this.additionPrice1 = additionPrice1;
        this.addition1 = addition1;
    }

    public String getAddition2() {

        return addition2;
    }

    public void setAddition2(String addition2, double additionPrice2) {
        this.additionPrice2 = additionPrice2;
        this.addition2 = addition2;
    }

    public String getAddition3() {

        return addition3;
    }

    public void setAddition3(String addition3, double additionPrice3) {
        this.additionPrice3 = additionPrice3;
        this.addition3 = addition3;
    }

    public String getAddition4() {

        return addition4;
    }

    public void setAddition4(String addition4, double additionPrice4) {
        this.additionPrice4 = additionPrice4;
        this.addition4 = addition4;
    }

    public double getBasePrice() {

        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getAdditionPrice1() {

        return additionPrice1;
    }

    public double getAdditionPrice2() {

        return additionPrice2;
    }

    public double getAdditionPrice3() {

        return additionPrice3;
    }

    public double getAdditionPrice4() {

        return additionPrice4;
    }
}
