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
    private long id;

    private long price;

    private long quantity;

    private Account account;

    @Override
    public int compareTo(Order o) {
        return Long.compare(price, o.price);
    }

    private OrderDirection orderDirection;

    private OrderType orderType;

    private OrderStatus orderStatus;
}
