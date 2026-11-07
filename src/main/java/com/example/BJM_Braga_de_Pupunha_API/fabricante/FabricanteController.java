package com.example.BJM_Braga_de_Pupunha_API.fabricante;

import java.util.List;

@RestController
@RequestMapping("/fabricantes")
public class FabricanteController {
    @Autowired
    private FabricanteService fabricanteService;

    @PostMapping
    public Fabricante postFabricante(@RequestBody Fabricante f){
        return this.fabricanteService.criarFabricante(f);
    }

    @GetMapping
    public List<Fabricante> listarAlunos(){
        return this.fabricanteService.listarFabricantes();
    }

    @PutMapping("/{id}")
    public Fabricante atualizarFabricante(@PathVariable("id") Long id, @RequestBody Fabricante f){
        return this.fabricanteService.atualizarFabricante(id, f);
    }
}
