package trilha.back.financys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.model.LancamentoDto;
import trilha.back.financys.model.Categoria;
import trilha.back.financys.model.Lancamento;
import trilha.back.financys.service.repositories.CategoriaRepository;
import trilha.back.financys.service.repositories.LancamentoRepository;
import trilha.back.financys.service.exceptions.CalculoException;
import trilha.back.financys.service.services.LancamentoService;

import java.util.*;
import java.util.stream.Collectors;


@Service
public class LancamentoServiceImpl implements LancamentoService {

    @Autowired
    private LancamentoRepository lancamentoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    public boolean validateCategoryById(Categoria idCategory){

        Optional<Categoria> idcategory = categoriaRepository.findById(idCategory.getId());

        if(idcategory.isPresent())
            return true;
        else
            return false;

    }

    public List<List<LancamentoDto>> agruparLancamentoPorCategoria(){

        List<Categoria> categorias = categoriaRepository.findAll();

        List<List<Lancamento>> lancamentos = new ArrayList<>();

        categorias.stream().map(categoria -> lancamentos.add(categoria.getLancamentos()));

        return lancamentos.stream()
                .map(lancamento -> LancamentoDto.convert(lancamento)).collect(Collectors.toList());

        //Map<String, List<LancamentoDto>> map = new HashMap<>();

//        for(Categoria categoria : categorias){
//            String key = "categoria" + categoria.getId().toString();
//            map.put(key, LancamentoDto.convert(categoria.getLancamentos()));
//        }
//
//        return map;
    }

    public Integer calculaMedia(Integer x, Integer y) {
        try {
            return (x / y);
        }catch (ArithmeticException e){
            throw new CalculoException("Atenção! Divisor(y) não pode ser zero");
        }
    }

}