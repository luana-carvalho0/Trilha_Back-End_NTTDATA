package trilha.back.financys.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.Entitys.Categoria;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/categorias")
public class controllerCategoria {

    List<Categoria> lista = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Categoria>> findall(){

        return ResponseEntity.ok().body(lista);
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Categoria categoria){
        lista.add(categoria);
        ResponseEntity.status(HttpStatus.CREATED);
        return  ResponseEntity.ok(lista.size());
    }



}