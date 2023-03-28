package dev.silva.cleancode.adapter.out.persistence;

import dev.silva.cleancode.application.port.out.LoadAccountPort;
import dev.silva.cleancode.application.port.out.UpdateAccountPort;
import dev.silva.cleancode.domain.Account;

public class AccountPersistenceAdapter implements LoadAccountPort, UpdateAccountPort {

    private final SpringAccountRepository accountRepository;

    public AccountPersistenceAdapter(SpringAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account load(Long id) {
        return accountRepository
                .findById(id)
                .map(AccountMapper::entityToDomain)
                .orElseThrow(RuntimeException::new); // mejorar exception
    }

    @Override
    public void update(Account account) {
        accountRepository.save(AccountMapper.domainToEntity(account));
    }

}
