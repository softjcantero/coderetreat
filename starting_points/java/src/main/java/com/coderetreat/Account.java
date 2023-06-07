package com.coderetreat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {


    private AccountEntry accountEntry;


    public void deposite(Integer value) {
        accountEntry = new AccountEntry(new Date(), value, value);
    }


    public List<AccountEntry> getEntries() {
        List<AccountEntry> ret = new ArrayList<AccountEntry>();
        ret.add(accountEntry);

        return ret;
    }

}
