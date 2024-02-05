import enums.Currency;
import pojo.Account;
import pojo.AccountDirector;

public class Main {
    public static void main(String[] args) {
        Account savingsAccount = AccountDirector.getSavingsAccount()
                .setAccountNumber("00192839288001")
                .setCurrency(Currency.USD)
                .build();

        Account usdCheckingAccount = AccountDirector.getCheckingAccount()
                .setAccountNumber("00192839288002")
                .setCurrency(Currency.USD)
                .setOverdraftAllowed(true)
                .setIban("US001TXUSD293940293392")
                .build();

        Account jpyCheckingAccount = AccountDirector.getCheckingAccount()
                .setAccountNumber("00177228356002")
                .setCurrency(Currency.JPY)
                .setOverdraftAllowed(true)
                .setIban("US001TXJPY6373899293392")
                .build();

        System.out.println(savingsAccount);
        System.out.println(usdCheckingAccount);
        System.out.println(jpyCheckingAccount);
    }
}