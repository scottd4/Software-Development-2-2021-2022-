public class CurrencyConvert implements CurrencyInterface {

    private double usd =0.0;

    @Override
    public void euroToUSD(double value) {
        usd = value / 1.14;
    }

    @Override
    public double usdToEuro() {
        return usd * 1.14;
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


}
