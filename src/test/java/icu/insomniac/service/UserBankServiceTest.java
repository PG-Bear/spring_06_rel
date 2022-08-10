package icu.insomniac.service;

import icu.insomniac.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserBankServiceTest {
    @Autowired
    private UserBankService userBankService;

    @Test
    public void testTransfer() throws IOException {
        userBankService.transfer("kelex", "tina", 10);
    }

    @Test
    public void testCheckBalance(){
        System.out.println(userBankService.checkBalance("kelex"));
        System.out.println(userBankService.checkBalance("tina"));
    }
}
