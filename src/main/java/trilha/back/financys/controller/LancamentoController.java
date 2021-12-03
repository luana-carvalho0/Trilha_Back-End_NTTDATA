package trilha.back.financys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.entitys.Lancamento;
import trilha.back.financys.mapper.LancamentoMapper;
import trilha.back.financys.repositories.CategoriaRepository;
import trilha.back.financys.repositories.LancamentoRepository;
import trilha.back.financys.service.CategoriaService;
import trilha.back.financys.service.LancamentoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoController {

    @Autowired /*injeção de dependência*/
    private LancamentoRepository lancamentoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private LancamentoService lancamentoService;

    @Autowired
    private CategoriaService categoriaService;

    @Autowired
    private LancamentoMapper lancamentoMapper;

    List<Lancamento> lista2 = new ArrayList<>();


    @GetMapping
    public ResponseEntity<Object> read(){

        List<Lancamento> lancamentos = lancamentoRepository.findAll();
        return ResponseEntity.ok(lancamentoService.agruparLancamentoPorCategoria());

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Object> findById(@PathVariable long id){

        return ResponseEntity.ok(lancamentoRepository.findById(id));

    }

    @GetMapping(path = "/{calcula}/{x}/{y}")
    public ResponseEntity<Integer> calculaMedia(@PathVariable(value = "x") Integer x,
                                                @PathVariable(value = "y") Integer y){

        return ResponseEntity.ok(lancamentoService.calculaMedia(x,y));

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

