package ru.emamontov.tradingService.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="users")
public class User implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToMany(mappedBy = "users")
    private Set<Account> accounts;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
