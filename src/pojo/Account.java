package pojo;

import enums.AccountType;
import enums.Currency;

import java.math.BigDecimal;

public class Account {
    private AccountType accountType;
    private BigDecimal balance;
    private String accountNumber;
    private String iban;
    private boolean overdraftAllowed;
    private Currency currency;

    public Account(AccountBuilder builder){
        this.accountNumber = builder.getAccountNumber();
        this.balance = builder.getBalance();
        this.accountType = builder.getAccountType();
        this.iban = builder.getIban();
        this.currency = builder.getCurrency();
        this.overdraftAllowed = builder.isOverdraftAllowed();
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountType=" + accountType +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", iban='" + iban + '\'' +
                ", overdraftAllowed=" + overdraftAllowed +
                ", currency=" + currency +
                '}';
    }
}
