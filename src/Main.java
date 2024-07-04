import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO THE CURRENCY EXCHANGE RATE CONVERTER");
        System.out.println("================================================");
        System.out.println("Please choose from the following currencies: \n");
        System.out.println("1. USD - United States dollar");
        System.out.println("2. CAD - Canadian dollar");
        System.out.println("3. JPY - Japanese yen");
        System.out.println("");

        System.out.println("Please enter [1 2 3] to choose the currency.");
        int baseCurrency = scanner.nextInt();
        System.out.println("Please enter the amount.");
        double baseCurrencyAmount = scanner.nextDouble();

        System.out.println("Please enter [1 2 3] to choose the currency to exchange into.");
        int exchangeCurrency = scanner.nextInt();

        double exchangeRate = getExchangeRate(baseCurrency, exchangeCurrency);
        double exchangeAmount = baseCurrencyAmount * exchangeRate;

        System.out.println("The exchanged amount is: " + exchangeAmount);
    }

    public static double getExchangeRate(int baseCurrency, int exchangeCurrency) {
        double [][] rates = {
                {1.0, 1.36, 161.01}, // USD to USD, CAD, JPY
                {0.73, 1.0, 118.21},  // CAD to USD, CAD, JPY
                {0.0062, 0.0085, 1.0}  // JPY to USD, CAD, JPY
        };
        return rates[baseCurrency - 1][exchangeCurrency - 1];
    }
}