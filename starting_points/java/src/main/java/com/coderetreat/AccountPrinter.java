package com.coderetreat;

import java.text.SimpleDateFormat;

public class AccountPrinter {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    private final Account account;

    public AccountPrinter(Account account) {
        this.account = account;
    }

    public String printStatement() {
        StringBuilder sb = new StringBuilder("Date\t\tAmount\t\tBalance\n");

        for (AccountEntry entry : account.getEntries()) {
            sb.append(dateFormat.format(entry.getDate())).append("\t\t");
            sb.append(buildSign(entry.getAmount())).append(entry.getAmount()).append("\t\t");
            sb.append(entry.getBalance()).append("\t\t");
        }


        return sb.toString();
    }


    private Character buildSign(Integer value) {
        return value > -1 ? '+' : '-';
    }

}
