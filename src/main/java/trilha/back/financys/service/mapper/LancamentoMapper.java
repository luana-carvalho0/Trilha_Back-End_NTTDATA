package trilha.back.financys.service.mapper;

import org.mapstruct.Mapper;
import trilha.back.financys.model.LancamentoDto;
import trilha.back.financys.model.Lancamento;

@Mapper(componentModel = "spring")
public interface LancamentoMapper {

    //LancamentoMapper INSTANCE = Mappers.getMapper(LancamentoMapper.class);
    LancamentoDto toLancamentoDto (Lancamento lancamento);

}
