package trilha.back.financys.service.services;

import org.springframework.stereotype.Service;
import trilha.back.financys.model.Lancamento;
import trilha.back.financys.model.LancamentoDto;
import trilha.back.financys.model.Categoria;


import java.util.*;



@Service
public interface LancamentoService {

    public boolean validateCategoryById(Categoria idCategory);

    public List<List<LancamentoDto>> agruparLancamentoPorCategoria();

    public Integer calculaMedia(Integer x, Integer y);

    public List<Lancamento> filter(String lancamento, String amount, boolean paid);

}