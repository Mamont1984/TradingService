package ru.emamontov.tradingService.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.emamontov.tradingService.entities.order.Order;

@Repository
public interface OrderRepository extends PagingAndSortingRepository<Order, Long> {
}
