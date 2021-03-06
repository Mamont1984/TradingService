package ru.emamontov.tradingService.services;

import ru.emamontov.tradingService.entities.order.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAllOrders();

    boolean createOrder(Order newOrder);
}
