package ru.emamontov.tradingService.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class User {
    @Id
    @GeneratedValue
    private long id;
    private String name;
}
