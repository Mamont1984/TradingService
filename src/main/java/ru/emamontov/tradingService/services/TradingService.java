package ru.emamontov.tradingService.services;

import ru.emamontov.tradingService.entities.order.Order;

public interface TradingService {
    boolean createOrder(Order newOrder);
}
