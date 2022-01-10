package trilha.back.financys.service.services;

import trilha.back.financys.model.Lancamento;
import trilha.back.financys.model.LancamentoSalvarDto;
import trilha.back.financys.model.SomaTotalDto;

import java.util.List;
import java.util.Optional;


public interface LancamentoService {

    boolean validateCategoryById(Long idCategory);

    List<SomaTotalDto> agruparLancamentoPorCategoria();

    Integer calculaMedia(Integer x, Integer y);

    Lancamento save(LancamentoSalvarDto dto);

    List<Lancamento> read();

    Optional<Lancamento> findById(Long id);

    public Lancamento atualizarLancamento(Long id, Lancamento lancamento);

    void delete(Long id);

    public List<Lancamento> filter(String lancamento, String amount, boolean paid);

}