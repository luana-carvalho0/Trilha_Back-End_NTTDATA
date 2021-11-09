package trilha.back.financys.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import trilha.back.financys.Entitys.Lancamento;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/lancamentos")
public class controllerLancamento {

    List<Lancamento> lista2 = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Lancamento>> lancamento(){
        lista2.sort((o1,o2) -> o1.getDate().compareTo(o2.getDate()));
        return ResponseEntity.ok().body(lista2);
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Lancamento lancamento){
        lista2.add(lancamento);
        ResponseEntity.status(HttpStatus.CREATED);
        return  ResponseEntity.ok(lista2.size());
    }


}