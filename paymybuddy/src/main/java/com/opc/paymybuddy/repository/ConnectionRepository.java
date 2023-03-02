package com.opc.paymybuddy.repository;

import com.opc.paymybuddy.model.Connection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnectionRepository extends JpaRepository<Connection,Integer> {
}
