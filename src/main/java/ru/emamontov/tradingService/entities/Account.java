package ru.emamontov.tradingService.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

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

    private long balance;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;
}
