package com.example.demo.repository;

import com.example.demo.dados.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repositorio extends  JpaRepository<Cliente,Long> {
}
