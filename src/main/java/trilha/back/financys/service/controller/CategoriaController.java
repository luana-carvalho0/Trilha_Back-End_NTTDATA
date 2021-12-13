package trilha.back.financys.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import trilha.back.financys.model.Categoria;
import trilha.back.financys.service.mapper.CategoriaMapper;
import trilha.back.financys.service.repositories.CategoriaRepository;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired /*injeção de dependência*/
    private CategoriaRepository categoriaRepository;

    @Autowired
    private CategoriaMapper categoriaMapper;

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

        categoriaRepository.save(categoria);
        return ResponseEntity.ok(categoriaMapper.toCategoriaDto(categoria));

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


