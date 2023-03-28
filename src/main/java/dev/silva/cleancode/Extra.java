package dev.silva.cleancode;

import dev.silva.cleancode.adapter.out.persistence.AccountEntity;
import dev.silva.cleancode.adapter.out.persistence.SpringAccountRepository;
import org.springframework.beans.factory.InitializingBean;

import java.math.BigDecimal;

public class Extra implements InitializingBean {


    private final SpringAccountRepository extra;

    public Extra(SpringAccountRepository extra) {
        this.extra = extra;
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        this.extra.save(new AccountEntity(1L, BigDecimal.valueOf(20)));
        this.extra.save(new AccountEntity(2L, BigDecimal.valueOf(25)));
    }

}
