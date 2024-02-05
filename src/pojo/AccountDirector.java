package pojo;

import enums.AccountType;

import java.math.BigDecimal;

public class AccountDirector {
    public static AccountBuilder getSavingsAccount(){
        AccountBuilder builder = new AccountBuilder();
        builder.setBalance(BigDecimal.ZERO);
        builder.setAccountType(AccountType.SAVINGS);
        return builder;
    }

    public static AccountBuilder getCheckingAccount(){
        AccountBuilder builder = new AccountBuilder();
        builder.setBalance(BigDecimal.ZERO);
        builder.setAccountType(AccountType.CHECKING);
        return builder;
    }

    public static AccountBuilder getLoanAccount(){
        AccountBuilder builder = new AccountBuilder();
        builder.setBalance(BigDecimal.ZERO);
        builder.setAccountType(AccountType.LOAN);
        return builder;
    }

    public static AccountBuilder getInvestingAccount(){
        AccountBuilder builder = new AccountBuilder();
        builder.setBalance(BigDecimal.ZERO);
        builder.setAccountType(AccountType.INVESTING);
        return builder;
    }
}
