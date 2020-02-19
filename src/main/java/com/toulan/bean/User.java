package com.toulan.bean;

import java.util.List;
import java.util.Map;

/**
 * @Author LOL_toulan
 * @Time 2020/2/19 21:39
 * @Message
 */
public class User {
    private String username;
    private String password;
    private List<Account> accounts;
    private Map<String, Account> accountMap;
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

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public Map<String, Account> getAccountMap() {
        return accountMap;
    }

    public void setAccountMap(Map<String, Account> accountMap) {
        this.accountMap = accountMap;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", accounts=" + accounts +
                ", accountMap=" + accountMap +
                '}';
    }
}
