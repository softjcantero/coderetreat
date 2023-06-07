package com.coderetreat;

import java.util.Date;

public class AccountEntry {


    private final Date date;

    private final Integer amount;

    private final Integer Balance;

    public AccountEntry(Date date, Integer amount, Integer balance) {

        this.date = date;
        this.amount = amount;
        Balance = balance;
    }

    public Integer getAmount() {
        return amount;
    }


    public Integer getBalance() {
        return Balance;
    }


    public Date getDate() {
        return date;
    }

}
