package com.example.BJM_Braga_de_Pupunha_API.fabricante;

@RestController
@RequestMapping("/fabricantes")
public class FabricanteController {
    @Autowired
    private FabricanteService favricanteService;

    @PostMapping
    public Fabricante postFabricante(Fabricante f){
        return this.fabricanteService.criarFabricante(f);
    }
}
