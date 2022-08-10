package icu.insomniac.service;


import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

public interface UserBankService {
    @Transactional(rollbackFor = IOException.class)
    boolean transfer(String outUsername, String inUsername, int amount) throws IOException;

    int checkBalance(String username);
}
