package trilha.back.financys.service.mapper;

import org.mapstruct.Mapper;
import trilha.back.financys.model.Lancamento;
import trilha.back.financys.model.LancamentoDto;
import trilha.back.financys.model.LancamentoSalvarDto;

@Mapper(componentModel = "spring")
public interface LancamentoMapper {

    LancamentoDto toLancamentoDto(Lancamento lancamento);

    Lancamento lancamentoSalvaDtoToLancamento(LancamentoSalvarDto dto);

}
