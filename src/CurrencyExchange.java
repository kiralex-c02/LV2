public class CurrencyExchange {
    final static double  HUF = 328.61;
    final static double  SEK = 10.76;
    final static double  USD = 1.12;
    final static double  CAD = 1.47;

    public static void main(String[] args) {
        System.out.printf("%.2f\n",exchangeCurrency("HUF", 12));
        System.out.printf("%.2f\n",exchangeCurrency("SEK", 100));
        System.out.printf("%.2f\n",exchangeCurrency(    "USD", 100));
        System.out.printf("%.2f\n",exchangeCurrency("CAD", 100));
    }

    public static double exchangeCurrency(String currency, double amount) {
        if(currency.equals("USD")) return amount * USD;
        else if (currency.equals("HUF")) return amount * HUF;
        else if (currency.equals("SEK")) return amount * SEK;
        else return amount * CAD;
    }
}
