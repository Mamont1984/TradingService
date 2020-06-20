package ru.emamontov.tradingService.entities.order;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.emamontov.tradingService.entities.Account;

import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode(of = {"id"})
@Entity
@Table(name="orders")
public class Order implements Serializable, Comparable<Order> {
    @Id
    @GeneratedValue
    final private long id;
    final private long price;
    final private long quantity;
    final private Account account;
    final public OrderDirection orderDirection;
    final public OrderType orderType;
    private OrderStatus orderStatus;

    @Override
    public int compareTo(Order o) {
        return Long.compare(price, o.price);
    }
}
