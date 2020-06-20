package ru.emamontov.tradingService.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name="users")
public class User implements Serializable {
    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    private long id;

    private String name;

    @OneToMany
    private Set<Account> accounts;
}
