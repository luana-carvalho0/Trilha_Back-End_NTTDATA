package trilha.back.financys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.dto.LancamentoDto;
import trilha.back.financys.entitys.Categoria;
import trilha.back.financys.entitys.Lancamento;
import trilha.back.financys.repositories.CategoriaRepository;
import trilha.back.financys.repositories.LancamentoRepository;

import java.util.*;


@Service
public class LancamentoService {

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

    public Map<String, List<LancamentoDto>> agruparLancamentoPorCategoria(){

        List<Categoria> categorias = categoriaRepository.findAll();
        Map<String, List<LancamentoDto>> map = new HashMap<>();

        for(Categoria categoria : categorias){
            String key = "categoria" + categoria.getId().toString();
            map.put(key, LancamentoDto.convert(categoria.getLancamentos()));
        }

        return map;
    }

}