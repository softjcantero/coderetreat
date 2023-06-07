package com.coderetreat;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Account {


    private final List<AccountEntry> accountEntries = new ArrayList<AccountEntry>();

    private BigInteger balance = BigInteger.valueOf(0l);


    public void deposite(Integer value) {
        balance = balance.add(BigInteger.valueOf(value));

        accountEntries.add(new AccountEntry(new Date(), value, balance.intValue()));
    }


    public void withdraw(Integer value) {
        Long auxValue = -1l * value;
        balance = balance.add(BigInteger.valueOf(auxValue));

        accountEntries.add(new AccountEntry(new Date(), auxValue.intValue(), balance.intValue()));
    }

    public List<AccountEntry> getEntries() {
        return Collections.unmodifiableList(accountEntries);
    }

}
