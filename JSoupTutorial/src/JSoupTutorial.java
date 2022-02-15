import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class JSoupTutorial {

    public static void main(String[] args) {
        try {

            double amount = 1000;
            String fromCurrency = "JPY";
            String toCurrency = "USD";

            Document doc = Jsoup.connect(String.format("https://www.xe.com/currencyconverter/convert/?Amount=%f&From=%s&To=%s", amount, fromCurrency, toCurrency)).get();

            Elements elements = doc.select("a");
            System.out.println(elements);
            for (Element element : elements) {
                //System.out.println(element);
                String classes = element.className();
                if(classes.contains("result__BigRate"))
                {
                    System.out.println(element.text());
                }
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
