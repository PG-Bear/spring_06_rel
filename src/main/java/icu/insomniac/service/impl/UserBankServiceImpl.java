package icu.insomniac.service.impl;

import icu.insomniac.dao.UserBankDao;
import icu.insomniac.main.UserBank;
import icu.insomniac.service.UserBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class UserBankServiceImpl implements UserBankService {
    @Autowired
    private UserBankDao userBankDao;

    public boolean transfer(String outUsername, String inUsername, int amount) throws IOException {
        UserBank out = userBankDao.selectByUsername(outUsername);
        UserBank in = userBankDao.selectByUsername(inUsername);
        if (out != null && in != null){
            if (!(out.getBalance() - amount < 0)){
                userBankDao.outMoney(outUsername, amount);
//                if(true){
//                    throw new IOException();
//                }
                userBankDao.inMoney(inUsername, amount);
                return true;
            }
        }
        return false;
    }

    public int checkBalance(String username) {
        UserBank userBank = userBankDao.selectByUsername(username);

        return userBank!=null ? userBank.getBalance() : -1;
    }
}
