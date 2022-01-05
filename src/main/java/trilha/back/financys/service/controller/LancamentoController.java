package trilha.back.financys.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trilha.back.financys.model.Lancamento;
import trilha.back.financys.model.LancamentoSalvarDto;
import trilha.back.financys.service.mapper.LancamentoMapper;
import trilha.back.financys.service.repositories.LancamentoRepository;
import trilha.back.financys.service.services.LancamentoService;


@RestController
@RequestMapping("/lancamentos")
public class LancamentoController {

    @Autowired
    private LancamentoService lancamentoService;

    @Autowired
    private LancamentoMapper lancamentoMapper;

    @Autowired
    private LancamentoRepository lancamentoRepository;

    @GetMapping
    public ResponseEntity<Object> read(){
        return ResponseEntity.ok(lancamentoService.read());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Object> findById(@PathVariable long id){

        return ResponseEntity.ok(lancamentoService.findById(id));

    }

    @GetMapping(path = "/{calcula}/{x}/{y}")
    public ResponseEntity<Integer> calculaMedia(@PathVariable(value = "x") Integer x,
                                                @PathVariable(value = "y") Integer y){

        return ResponseEntity.ok(lancamentoService.calculaMedia(x,y));

    }


    @GetMapping(path = "/filter")
    public ResponseEntity<Object> getLancamentosPendentes(
            @RequestParam(value = "datalancamento", required = false) String datalancamento,
            @RequestParam(value = "amount", required = false) String amount,
            @RequestParam(value = "paid", required = false) boolean paid

    ){
        try {
            return  ResponseEntity.ok(lancamentoService.filter(datalancamento, amount, paid));
        } catch (Exception e){
            return ResponseEntity.noContent().build();
        }
    }




    @PostMapping
    public ResponseEntity<Object> create(@RequestBody LancamentoSalvarDto dto){

        if(lancamentoService.validateCategoryById(dto.getCatId())) {
            return ResponseEntity.ok(lancamentoService.save(dto));
        }else{
            System.out.println("Não existe essa categoria");
        }

        return ResponseEntity.ok(HttpStatus.OK);
    }


    @PutMapping(path = "/{id}")
    public Lancamento update(@RequestBody Lancamento lancamento){

        return lancamentoService.update(lancamento);

    }

    @DeleteMapping(path = "/{id}")
    public void delete(@RequestBody Lancamento lancamento){

        lancamentoService.delete(lancamento);

    }



}

