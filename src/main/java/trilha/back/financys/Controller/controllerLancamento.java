package trilha.back.financys.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.Entitys.Lancamento;
import trilha.back.financys.Repositories.RepositoryLancamento;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/lancamentos")
public class controllerLancamento {

    @Autowired /*injeção de dependência*/
    private RepositoryLancamento repositoryLancamento;

    List<Lancamento> lista2 = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Lancamento>> Read(){

        repositoryLancamento.findAll();
        lista2.sort((o1,o2) -> o1.getDate().compareTo(o2.getDate()));
        return ResponseEntity.ok(lista2);

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Object> findById(@PathVariable long id){

        return ResponseEntity.ok(repositoryLancamento.findById(id));

    }

    @PostMapping
    public ResponseEntity<Object> Create(@RequestBody Lancamento lancamento){

        return  ResponseEntity.ok(repositoryLancamento.save(lancamento));

    }

    @PutMapping(path = "/{id}")
    public Lancamento Update(@RequestBody Lancamento lancamento){

        return repositoryLancamento.save(lancamento);

    }

    @DeleteMapping(path = "/{id}")
    public void Delete(@RequestBody Lancamento lancamento){

        repositoryLancamento.delete(lancamento);

    }



}

