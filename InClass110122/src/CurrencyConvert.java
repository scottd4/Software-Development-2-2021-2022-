public class CurrencyConvert implements CurrencyInterface {

    private double usd = 0.0;

    @Override
    public double getUSD() {
        return usd;
    }

    @Override
    public void setUSD(double value) {
        usd = value;
    }

    @Override
    public void euroToUSD(double value) {
        usd = value * 1.14;
    }

    @Override
    public double usdToEuro() {
        return usd / 1.14;
    }


    @Override
    public void gbpToUSD(double value) {

    }

    @Override
    public double usdToGBP() {
        return 0;
    }


    @Override
    public void yuanToUSD(double value) {

    }

    @Override
    public double usdToYuan() {
        return 0;
    }

    public static void main(String[] args) {
        CurrencyConvert c = new CurrencyConvert();

        c.euroToUSD(50);

        System.out.println("The value in USD is: " + c.getUSD());

        c.setUSD(1000);

        System.out.println("The value in Euro is: " + c.usdToEuro());

    }

}
