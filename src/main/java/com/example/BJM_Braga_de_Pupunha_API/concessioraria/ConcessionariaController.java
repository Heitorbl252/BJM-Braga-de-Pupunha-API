package concessioraria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/concessionarias")
public class ConcessionariaController {
    @Autowired
    private ConcessionariaService concessionariaService;

    @PostMapping
    public Concessionaria postConcessionaria(@RequestBody Concessionaria concessionaria){
        System.out.println("Controller ok");
        return this.concessionariaService.adicionarConcessionaria(concessionaria);
    }

//    @GetMapping
//    public Concessionaria getConcessionarias(){
//        return this.concessionariaService.listarConcessionarias();
//    }
}
