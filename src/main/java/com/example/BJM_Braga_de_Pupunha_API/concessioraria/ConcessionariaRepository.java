package com.example.BJM_Braga_de_Pupunha_API.concessioraria;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcessionariaRepository extends JpaRepository <Concessionaria, Long> {
    Concessionaria getAllById(Long id);
}
