package trilha.back.financys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.model.Categoria;
import trilha.back.financys.model.Lancamento;
import trilha.back.financys.model.LancamentoSalvarDto;
import trilha.back.financys.model.SomaTotalDto;
import trilha.back.financys.service.exceptions.CalculoException;
import trilha.back.financys.service.mapper.LancamentoMapper;
import trilha.back.financys.service.repositories.CategoriaRepository;
import trilha.back.financys.service.repositories.LancamentoRepository;
import trilha.back.financys.service.services.LancamentoService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class LancamentoServiceImpl implements LancamentoService {

    @Autowired
    private LancamentoRepository lancamentoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private LancamentoMapper mapper;

    @Autowired
    private LancamentoService lancamentoService;


    @Override
    public boolean validateCategoryById(Long idCategory){

        Optional<Categoria> idcategory = categoriaRepository.findById(idCategory);

        if(idcategory.isPresent())
            return true;
        else
            return false;

    }

    @Override
    public List<SomaTotalDto> agruparLancamentoPorCategoria(){

        List<Categoria> categorias = categoriaRepository.findAll();

        return categorias.stream().map(categoria ->
            new SomaTotalDto(categoria.getName(), categoria.getLancamentos())
        ).collect(Collectors.toList());
    }

    @Override
    public Integer calculaMedia(Integer x, Integer y) {
        try {
            return (x / y);
        }catch (ArithmeticException e){
            throw new CalculoException("Atenção! Divisor(y) não pode ser zero");
        }
    }

    @Override
    public Lancamento save(LancamentoSalvarDto dto) {
        System.out.println(dto);
        Lancamento lanc = mapper.lancamentoSalvaDtoToLancamento(dto);
        lanc.setCategoryId(categoriaRepository.findById(dto.getCatId()).get());
        lancamentoRepository.save(lanc);
        return lanc;
    }

    @Override
    public List<Lancamento> read(){

        return lancamentoRepository.findAll();

    }

    @Override
    public Optional<Lancamento> findById(Long id){

        return lancamentoRepository.findById(id);
    }

    @Override
    public Lancamento atualizarLancamento(Long id, Lancamento lancamento) {
        Lancamento lanc = lancamentoRepository.findById(id).get();
        return lancamentoRepository.save(atualizado(lanc, lancamento));

    }

    public Lancamento atualizado(Lancamento lanc, Lancamento lancamento) {
        lanc.setName(lancamento.getName());
        lanc.setDescription(lancamento.getDescription());
        return lanc;
    }

    @Override
    public void delete(Lancamento lancamento) {
        lancamentoRepository.delete(lancamento);
    }

    public List<Lancamento> filter(String date, String amount, boolean paid){

        if (date == null || amount == null){
            throw new RuntimeException("Parametros com valores errados");
        }
        List<Lancamento> lancamentos = lancamentoRepository.findAllByDateAndAmountAndPaid(date, amount, paid);
        return lancamentos;
    }


}