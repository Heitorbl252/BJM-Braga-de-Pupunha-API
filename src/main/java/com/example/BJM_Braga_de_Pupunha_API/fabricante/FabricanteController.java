package com.example.BJM_Braga_de_Pupunha_API.fabricante;

import java.util.List;

@RestController
@RequestMapping("/fabricantes")
public class FabricanteController {
    @Autowired
    private FabricanteService fabricanteService;

    @PostMapping
    public Fabricante postFabricante(Fabricante f){
        return this.fabricanteService.criarFabricante(f);
    }

    @GetMapping
    public List<Fabricante> listarAlunos(){
        return this.fabricanteService.listarFabricantes();
    }
}
