package ru.emamontov.tradingService.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@EqualsAndHashCode(of = {"id"})
@Entity
@Table(name="users")
public class User implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToMany
    private Set<Account> accounts;

    public void addAccount(Account account){
        accounts.add(account);
    }
}
