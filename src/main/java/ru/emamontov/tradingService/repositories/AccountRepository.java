package ru.emamontov.tradingService.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.emamontov.tradingService.entities.Account;
import ru.emamontov.tradingService.entities.User;

import java.util.List;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
    public List<Account> findByUser(User user);
}
