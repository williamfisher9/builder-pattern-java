import enums.Currency;
import pojo.Account;
import pojo.AccountDirector;

public class Main {
    public static void main(String[] args) {
        Account savingsAccount = AccountDirector.getSavingsAccount()
                .setAccountNumber("00192839288001")
                .setCurrency(Currency.USD)
                .build();

        Account checkingAccount = AccountDirector.getCheckingAccount()
                .setAccountNumber("00192839288002")
                .setCurrency(Currency.USD)
                .setOverdraftAllowed(true)
                .setIban("US001TX930293940293392")
                .build();

        System.out.println(savingsAccount);
        System.out.println(checkingAccount);
    }
}