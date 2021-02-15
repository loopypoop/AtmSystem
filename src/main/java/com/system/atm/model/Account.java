package com.system.atm.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Account {

    private String username;
    private String password;
    private String email;
    @Qualifier("card")
    private Card card;

    @Autowired
    public Account(@Value("${account.username}") String username,@Value("${account.password}") String password,
                   @Value("${account.email}") String email, Card card) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.card = card;
    }

    public Account() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
