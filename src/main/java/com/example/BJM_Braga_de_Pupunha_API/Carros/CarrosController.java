package com.example.BJM_Braga_de_Pupunha_API.Carros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarrosController {
    @Autowired
    public CarrosService carrosService;




    @PostMapping
    public Carros novoCarro (@RequestBody Carros c){
       return this.carrosService.salvar(c);
    }

    @GetMapping
    public List<Carros> listarCarros (){
        return this.carrosService.listarCarros();
    }

    @PutMapping("/{id}")
    public Carros putCarro (@PathVariable("id") Long id, @RequestBody Carros c){
        return this.carrosService.atualizarCarro(id, c);
    }

    @DeleteMapping("/{id}")
    public void deleteCarro (@PathVariable("id") Long id){
        this.carrosService.apagarCarro(id);
    }



}
