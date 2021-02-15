package com.system.atm.service;

import com.system.atm.model.Account;
import org.springframework.stereotype.Component;

@Component
public interface IBankService {
    void withdraw(Account account);
    double checkBalance(Account account);
    void topUp(Account account);
}
