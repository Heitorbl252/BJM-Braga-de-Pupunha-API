package com.example.BJM_Braga_de_Pupunha_API.fabricante;

@Service
public class FabricanteService {
    @Autowired
    private FabricanteRepository fabricanteRepository;

    public Fabricante criarFabricante(Fabricante fabricante){
        return this.fabricanteRepository.save(fabricante);
    }
}
