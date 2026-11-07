package com.example.BJM_Braga_de_Pupunha_API.fabricante;

import com.example.BJM_Braga_de_Pupunha_API.Carros.Carros;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
@Data
public class Fabricante {
    @Id
    @GeneratedValue(strategy = GenerateValue.AUTO)
    private Long id;
    private String nome;
    @OneToMany
    List<Carros> carros;

    public Fabricante(String nome, List<Carros> carros) {
        this.nome = nome;
        this.carros = carros;
    }
}
