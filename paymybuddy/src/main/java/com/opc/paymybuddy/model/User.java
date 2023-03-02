package com.opc.paymybuddy.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "balance")
    private BigDecimal balance;

    @OneToMany(mappedBy = "iniuser")
    private List<Transaction> initiatedTransactions = new ArrayList<>();

    @OneToMany(mappedBy = "payuser")
    private List<Transaction> receivedTransactions = new ArrayList<>();

    @OneToMany(mappedBy = "emitter")
    private List<Connection> emitterConnections = new ArrayList<>();

    @OneToMany(mappedBy = "receiver")
    private List<Connection> receiverConnections =new ArrayList<>();
}
