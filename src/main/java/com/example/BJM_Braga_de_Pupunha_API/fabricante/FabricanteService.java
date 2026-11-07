package com.example.BJM_Braga_de_Pupunha_API.fabricante;

import java.util.List;

@Service
public class FabricanteService {
    @Autowired
    private FabricanteRepository fabricanteRepository;

    public Fabricante criarFabricante(Fabricante fabricante){
        return this.fabricanteRepository.save(fabricante);
    }

    public List<Fabricante> listarFabricantes() {
        return this.fabricanteRepository.findAll();
    }
}
