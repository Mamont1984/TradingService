package ru.emamontov.tradingService.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository<Account, Long> extends CrudRepository<Account, Long> {
}
