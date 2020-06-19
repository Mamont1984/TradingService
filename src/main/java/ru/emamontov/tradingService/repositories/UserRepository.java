package ru.emamontov.tradingService.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository<User, Long> extends CrudRepository<User, Long> {
}
