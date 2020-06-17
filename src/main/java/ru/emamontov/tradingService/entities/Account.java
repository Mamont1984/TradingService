package ru.emamontov.tradingService.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="accounts")
public class Account implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private long balance;
    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;

    public long getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
