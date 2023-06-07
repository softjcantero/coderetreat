package com.coderetreat;

import static org.fest.assertions.Assertions.assertThat;
import org.junit.Before;
import org.junit.Test;

public class AccountPrinterTest {

    private AccountPrinter accountPrinter;

    @Before
    public void setUp() {
        accountPrinter = new AccountPrinter();
    }

    @Test
    public void testHeader() {
       String statement = accountPrinter.printStatement();

       assertThat(statement.equals("Date\t\tAmount\t\tBalance")).isEqualTo(true);
    }

}
