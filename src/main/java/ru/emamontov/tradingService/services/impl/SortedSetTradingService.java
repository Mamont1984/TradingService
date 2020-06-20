package ru.emamontov.tradingService.services.impl;

import org.springframework.stereotype.Service;
import ru.emamontov.tradingService.entities.order.Order;
import ru.emamontov.tradingService.services.TradingService;

import java.util.SortedSet;
import java.util.TreeSet;

@Service
public class SortedSetTradingService implements TradingService {

    private SortedSet<Order> ask = new TreeSet<>();
    private SortedSet<Order> bid = new TreeSet<>();

    @Override
    public boolean createOrder(Order newOrder) {
        return newOrder.getAccount().reserveCurrency(newOrder);
    }
}
