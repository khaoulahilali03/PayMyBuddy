package com.opc.paymybuddy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "connection")
public class Connection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "connection_id")
    private Integer id;

    private LocalDateTime connectDate;

    @ManyToOne()
    @JoinColumn(name = "fk_emitter_id")
    private User emitter;

    @ManyToOne()
    @JoinColumn(name = "fk_receiver_id")
    private User receiver;
}
