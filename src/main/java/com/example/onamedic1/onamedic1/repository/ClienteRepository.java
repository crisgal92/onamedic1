package com.example.onamedic1.onamedic1.repository;

import com.example.onamedic1.onamedic1.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Integer>{
}
