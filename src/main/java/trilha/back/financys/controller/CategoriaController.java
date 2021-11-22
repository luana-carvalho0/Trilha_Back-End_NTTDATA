package trilha.back.financys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.entitys.Categoria;
import trilha.back.financys.repositories.CategoriaRepository;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired /*injeção de dependência*/
    private CategoriaRepository categoriaRepository;

    List<Categoria> lista = new ArrayList<>();


    @GetMapping
    public ResponseEntity<List<Categoria>> read(){

        return ResponseEntity.ok(categoriaRepository.findAll());

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Object> findById(@PathVariable long id){

        return ResponseEntity.ok(categoriaRepository.findById(id));

    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody Categoria categoria){

        return ResponseEntity.ok(categoriaRepository.save(categoria));

    }

    @PutMapping(path = "/{id}")
    public Categoria update(@RequestBody Categoria categoria){

        return categoriaRepository.save(categoria);

    }

    @DeleteMapping(path = "/{id}")
    public void delete(@RequestBody Categoria categoria){

        categoriaRepository.delete(categoria);

    }

}


