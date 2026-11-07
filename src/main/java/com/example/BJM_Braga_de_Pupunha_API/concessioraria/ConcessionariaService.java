package com.example.BJM_Braga_de_Pupunha_API.concessioraria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class ConcessionariaService {
    @Autowired
    ConcessionariaRepository concessionariaRepository;

    public Concessionaria adicionarConcessionaria(Concessionaria concessionaria) {
    System.out.println("Service ok");
        return this.concessionariaRepository.save(concessionaria);
    }

    public List<Concessionaria> listarConcessionarias() {
        return this.concessionariaRepository.findAll();
    }


    public Concessionaria atualizarDadosConcessionaria(Long idConcessionaria, Concessionaria concessionaria) {
        boolean hasConcessionaria = this.concessionariaRepository.findById(idConcessionaria).isPresent();
        if (hasConcessionaria){
            Concessionaria concessionariaEncontrada = this.concessionariaRepository.findById(idConcessionaria).get();
            concessionariaEncontrada.setNomeConcessioria(concessionaria.getNomeConcessioria());
            concessionariaEncontrada.setNomeCidade(concessionaria.getNomeCidade());
            concessionariaEncontrada.setNumeroEndereco(concessionaria.getNumeroEndereco());
            concessionariaEncontrada.setRua(concessionaria.getRua());
            concessionariaEncontrada.setDono(concessionaria.getDono());
            concessionariaEncontrada.setEmail(concessionaria.getEmail());

            return this.concessionariaRepository.save(concessionaria);
        } else {
            return null;
        }
    }

    public void excluirConcessionaria(Long idConcessionaria) {
        boolean hasConcessionaria = this.concessionariaRepository.findById(idConcessionaria).isPresent();
        if (hasConcessionaria){
            this.concessionariaRepository.deleteById(idConcessionaria);
        }
    }
}
