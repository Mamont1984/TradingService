package ru.emamontov.tradingService.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.emamontov.tradingService.entities.Account;
import ru.emamontov.tradingService.entities.order.Order;
import ru.emamontov.tradingService.entities.order.OrderDirection;
import ru.emamontov.tradingService.entities.order.OrderType;
import ru.emamontov.tradingService.repositories.OrderRepository;
import ru.emamontov.tradingService.services.OrderService;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;
    private SortedSetTradingService sortedSetTradingService;

    @Autowired
    public void setSortedSetTradingService(SortedSetTradingService sortedSetTradingService) {
        this.sortedSetTradingService = sortedSetTradingService;
    }

    @Autowired
    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> findAllOrders() {
        List<Order> list = new ArrayList<>();
        orderRepository.findAll().forEach(e -> list.add(e));
        return list;
    }

    @Override
    public boolean createOrder(Order newOrder) {
        return sortedSetTradingService.createOrder(newOrder);
    }
}
