package concessioraria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConcessionariaService {
    @Autowired
    ConcessionariaRepository concessionariaRepository;

    public Concessionaria adicionarConcessionaria(Concessionaria concessionaria) {
    System.out.println("Service ok");
        return this.concessionariaRepository.save(concessionaria);
    }

//    public Concessionaria listarConcessionarias(ConcessionariaDTO idConcessionaria) {
//
//    }


}
