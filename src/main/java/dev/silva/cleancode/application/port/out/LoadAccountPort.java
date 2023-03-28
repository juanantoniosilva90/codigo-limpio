package dev.silva.cleancode.application.port.out;

import dev.silva.cleancode.domain.Account;

public interface LoadAccountPort {

    Account load(Long id);

}
