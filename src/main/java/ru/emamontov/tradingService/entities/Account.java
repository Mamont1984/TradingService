package ru.emamontov.tradingService.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.emamontov.tradingService.entities.order.Order;

import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode(of = {"id"})
@Entity
@Table(name="accounts")
public class Account implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private long currencyAmount;
    private long currencyReserved;
    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;

    public synchronized boolean reserveCurrency(Order newOrder){
        long quantity = newOrder.getQuantity();
        if (currencyAmount < quantity) return false;
        currencyAmount -= quantity;
        currencyReserved += quantity;
        return true;
    }
}
