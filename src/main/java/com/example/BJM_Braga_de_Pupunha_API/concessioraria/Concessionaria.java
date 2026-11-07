package com.example.BJM_Braga_de_Pupunha_API.concessioraria;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Concessionaria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomeConcessioria;
    private String nomeCidade;
    private String numeroEndereco;
    private String rua;
    private String dono;
    private String email;
    private LocalDateTime createdAt;

    public Concessionaria(String nomeConcessioria, String nomeCidade, String numeroEndereco, String rua, String dono, String email) {
        this.nomeConcessioria = nomeConcessioria;
        this.nomeCidade = nomeCidade;
        this.numeroEndereco = numeroEndereco;
        this.rua = rua;
        this.dono = dono;
        this.email = email;
        this.createdAt = LocalDateTime.now();
    }

    public Concessionaria() {

    }
}
