public interface CurrencyInterface {

    double getUSD();
    void setUSD(double d);

    void euroToUsd(double d);
    double euroFromUsd();

    void gbpToUsd(double d);
    double gbpFromUsd();

    void yuanToUsd(double d);
    double yuanFromUsd();

}
