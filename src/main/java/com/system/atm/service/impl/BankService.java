package com.system.atm.service.impl;
import com.system.atm.model.Account;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.system.atm.service.IBankService;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BankService implements IBankService {

    Scanner in = new Scanner(System.in);
    DecimalFormat numberFormat = new DecimalFormat("#.00");

    @Override
    public void withdraw(Account account) {
        System.out.print("Your balance: ");
        System.out.println("$" + numberFormat.format(account.getCard().getBalance()));
        System.out.print("Input the amount of money you want to withdraw: ");
        double outputMoney = in.nextDouble();
        if (outputMoney <= account.getCard().getBalance()) {
            account.getCard().setBalance(account.getCard().getBalance() - outputMoney);
            System.out.println("Balance updated to $" + numberFormat.format(account.getCard().getBalance()));
        } else
            System.out.println("Not enough money!");
    }

    @Override
    public double checkBalance(Account account) {
        return account.getCard().getBalance();
    }

    @Override
    public void topUp(Account account) {
        System.out.print("Your balance: ");
        System.out.println("$" + numberFormat.format(account.getCard().getBalance()));
        System.out.print("Input the bills: ");
        double inputMoney = in.nextDouble();
        account.getCard().setBalance(account.getCard().getBalance() + inputMoney);
        System.out.println("Balance updated to $" + numberFormat.format(account.getCard().getBalance()));
    }
}
