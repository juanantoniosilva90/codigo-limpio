package dev.silva.cleancode.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringAccountRepository extends JpaRepository<AccountEntity, Long> {
}
