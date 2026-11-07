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

    public Fabricante atualizarFabricante(Long id, Fabricante f) {
        boolean hasFabricante = this.fabricanteRepository.findById(id).isPresent();
        if(hasFabricante){
            Fabricante fabricante = this.fabricanteRepository.findById(id).get();
        } else {
            return null;
        }
    }
}
