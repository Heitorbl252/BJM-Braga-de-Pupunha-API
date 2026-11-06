package com.example.BJM_Braga_de_Pupunha_API.Carros;

import org.springframework.beans.factory.annotation.Autowired;
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

}
