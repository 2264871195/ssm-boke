package com.wx.dao;

import com.wx.bean.Account;

import java.util.List;

public interface IAccountdao {

    public List<Account> findAll();

    public void saveAccount(Account account);
}