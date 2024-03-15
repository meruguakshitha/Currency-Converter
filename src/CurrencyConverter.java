import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in USD: ");
        double usdAmount = scanner.nextDouble();

        System.out.print("Enter exchange rate: ");
        double exchangeRate = scanner.nextDouble();

        double convertedAmount = usdAmount * exchangeRate;

        System.out.println("Converted amount: " + convertedAmount);
}
}

