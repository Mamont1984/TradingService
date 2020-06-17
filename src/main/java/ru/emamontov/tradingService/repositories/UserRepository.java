package ru.emamontov.tradingService.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.emamontov.tradingService.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
