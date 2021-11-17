package trilha.back.financys.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.Entitys.Lancamento;
import trilha.back.financys.Repositories.CategoriaRepository;
import trilha.back.financys.Repositories.LancamentoRepository;
import trilha.back.financys.Service.LancamentoService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoController {

    @Autowired /*injeção de dependência*/
    private LancamentoRepository lancamentoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private LancamentoService lancamentoService;

    List<Lancamento> lista2 = new ArrayList<>();


    @GetMapping
    public ResponseEntity<List<Lancamento>> read(){

        lancamentoRepository.findAll();
        lista2.sort((o1,o2) -> o1.getDate().compareTo(o2.getDate()));
        return ResponseEntity.ok(lista2);

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Object> findById(@PathVariable long id){

        return ResponseEntity.ok(lancamentoRepository.findById(id));

    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody Lancamento lancamento){

        if(lancamentoService.validateCategoryById(lancamento.getCategoryId())) {
            return ResponseEntity.ok(lancamentoRepository.save(lancamento));
        }else{
            System.out.println("Não existe essa categoria");
        }

        return ResponseEntity.ok(HttpStatus.OK);
    }


    @PutMapping(path = "/{id}")
    public Lancamento update(@RequestBody Lancamento lancamento){

        return lancamentoRepository.save(lancamento);

    }

    @DeleteMapping(path = "/{id}")
    public void Delete(@RequestBody Lancamento lancamento){

        lancamentoRepository.delete(lancamento);

    }



}

