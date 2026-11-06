package com.example.BJM_Braga_de_Pupunha_API.Carros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
