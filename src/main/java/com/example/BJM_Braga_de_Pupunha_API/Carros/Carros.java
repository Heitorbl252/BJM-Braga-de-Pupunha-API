package com.example.BJM_Braga_de_Pupunha_API.Carros;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Carros {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    public String nome;
    public String modelo;
    public int ano;
    private LocalDateTime dataFabricacao;

    public Carros(String nome, String modelo, int ano, LocalDateTime dataFabricacao) {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
        this.dataFabricacao = LocalDateTime.now();
    }

    public Carros() {

    }
}

