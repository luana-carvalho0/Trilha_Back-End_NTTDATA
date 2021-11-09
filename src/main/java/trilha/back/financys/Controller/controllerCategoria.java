package trilha.back.financys.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import trilha.back.financys.Entitys.Categoria;
import trilha.back.financys.Repositories.RepositoryCategoria;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/categorias")
public class controllerCategoria {

    @Autowired /*injeção de dependência*/
    private RepositoryCategoria repositoryCategoria;

    List<Categoria> lista = new ArrayList<>();


    @GetMapping
    public ResponseEntity<List<Categoria>> Read(){

        return ResponseEntity.ok(repositoryCategoria.findAll());

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Object> findById(@PathVariable long id){

        return ResponseEntity.ok(repositoryCategoria.findById(id));

    }

    @PostMapping
    public ResponseEntity<Object> Create(@RequestBody Categoria categoria){

        return ResponseEntity.ok(repositoryCategoria.save(categoria));

    }

    @PutMapping(path = "/{id}")
    public Categoria Update(@RequestBody Categoria categoria){

        return repositoryCategoria.save(categoria);

    }

    @DeleteMapping(path = "/{id}")
    public void Delete(@RequestBody Categoria categoria){

        repositoryCategoria.delete(categoria);

    }


}


