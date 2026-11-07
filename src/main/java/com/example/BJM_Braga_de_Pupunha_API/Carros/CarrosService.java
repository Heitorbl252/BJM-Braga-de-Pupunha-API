package com.example.BJM_Braga_de_Pupunha_API.Carros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CarrosService {

    @Autowired
    public CarrosRepository carrosRepository;


    public Carros salvar(Carros c) {
        return this.carrosRepository.save(c);
    }

    public List<Carros> listarCarros() {
        return this.carrosRepository.findAll();
    }


    public Carros atualizarCarro(Long id, Carros c) {
        boolean hasCarro = this.carrosRepository.findById(id).isPresent();
        if (hasCarro) {
            Carros carroEncontrado = this.carrosRepository.findById(id).get();
            carroEncontrado.setNome(c.getNome());
            carroEncontrado.setModelo(c.getModelo());
            carroEncontrado.setAno(c.getAno());
            carroEncontrado.setDataFabricacao(c.getDataFabricacao());
            return this.carrosRepository.save(carroEncontrado);
        } else  {
            return null;
        }
    }

    public void apagarCarro(Long id) {
        boolean hasCarro = this.carrosRepository.findById(id).isPresent();
        if (hasCarro) {
            this.carrosRepository.deleteById(id);
        } else {
            System.out.println("?");
        }
    }
}
