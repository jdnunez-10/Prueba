package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.entidades.Posicion;

@Repository
public interface PosicionRepository extends JpaRepository<Posicion, Integer>{
    
}
