package com.example.jpa.reprository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpa.model.Contrat;
@Repository
public interface ContratReprository  extends JpaRepository<Contrat,Long> {
Contrat findByname(String name);
}