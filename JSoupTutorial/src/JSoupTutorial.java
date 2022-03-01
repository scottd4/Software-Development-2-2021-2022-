import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class JSoupTutorial {

    public double convert(double amount, String from, String to)
    {


        return 0.0;
    }

    public static void main(String[] args) {
        try {

            double amount = 1000;
            String fromCurrency = "EUR";
            String toCurrency = "USD";

            Document doc = Jsoup.connect(String.format("https://www.xe.com/currencyconverter/convert/?Amount=%f&From=%s&To=%s", amount, fromCurrency, toCurrency)).get();

            //System.out.println(doc);

            Elements elements = doc.select("p");
            //System.out.println(elements);
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
