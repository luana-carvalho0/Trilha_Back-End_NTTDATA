package trilha.back.financys.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.model.Categoria;
import trilha.back.financys.service.mapper.CategoriaMapper;
import trilha.back.financys.service.services.CategoriaService;

import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired /*injeção de dependência*/
    private CategoriaService categoriaService;

    @Autowired
    private CategoriaMapper categoriaMapper;

    List<Categoria> lista = new ArrayList<>();


    @GetMapping
    public ResponseEntity<List<Categoria>> read(){

        return ResponseEntity.ok(categoriaService.read());

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Object> findById(@PathVariable long id){

        return ResponseEntity.ok(categoriaService.findById(id));

    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody Categoria categoria){

        categoriaService.create(categoria);
        return ResponseEntity.ok(categoriaMapper.toCategoriaDto(categoria));

    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Object> update(@PathVariable Long id, @RequestBody Categoria categoria){

        return ResponseEntity.ok(categoriaService.atualizarCategoria(id, categoria));

    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id){

        categoriaService.delete(id);

    }

}


