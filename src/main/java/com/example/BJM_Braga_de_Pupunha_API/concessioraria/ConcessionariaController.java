package com.example.BJM_Braga_de_Pupunha_API.concessioraria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/concessionarias")
public class ConcessionariaController {
    @Autowired
    private ConcessionariaService concessionariaService;

    @PostMapping
    public Concessionaria adicionarConcessionaria(@RequestBody Concessionaria concessionaria) {
        System.out.println("Controller ok");
        return this.concessionariaService.adicionarConcessionaria(concessionaria);
    }

    @GetMapping
    public List<Concessionaria> listarConcessionarias() {
        return this.concessionariaService.listarConcessionarias();
    }

    @PutMapping("/{concessionariaId}")
    public Concessionaria updateConcessionaria(@PathVariable("concessionariaId") Long id, @RequestBody Concessionaria concessionaria) {
        return this.concessionariaService.atualizarDadosConcessionaria(id, concessionaria);
    }

    @DeleteMapping("/{concessionariaId}")
    public void deleteConcecionaria(@PathVariable("concessionariaId") Long id){
        this.concessionariaService.excluirConcessionaria(id);
    }
}
