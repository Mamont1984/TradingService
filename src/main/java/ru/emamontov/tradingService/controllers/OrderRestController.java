package ru.emamontov.tradingService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.emamontov.tradingService.entities.order.Order;
import ru.emamontov.tradingService.services.OrderService;

import java.util.List;

@RestController
@RequestMapping("api/v1/orders")
public class OrderRestController {

    OrderService orderService;

    @Autowired
    public void setTradeService(OrderService tradeService) {
        this.orderService = tradeService;
    }

    @GetMapping
    public List<Order> findAllOrders(){
        return orderService.findAllOrders();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Order createOrder(@RequestBody Order newOrder){
        if (orderService.createOrder(newOrder)) return newOrder;
        return null; //todo throw exception
    }
}
