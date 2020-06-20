package ru.emamontov.tradingService.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name="accounts")
public class Account implements Serializable {
    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private long id;

    private long balance;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;
}
