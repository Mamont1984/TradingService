package ru.emamontov.tradingService.services;

import ru.emamontov.tradingService.entities.order.Order;

public interface TradingService {
    void createOrder(Order newOrder);
}
