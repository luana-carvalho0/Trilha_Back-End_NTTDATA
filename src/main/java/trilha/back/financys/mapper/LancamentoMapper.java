package trilha.back.financys.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import trilha.back.financys.dto.LancamentoDto;
import trilha.back.financys.entitys.Lancamento;

@Mapper(componentModel = "spring")
public interface LancamentoMapper {

    //LancamentoMapper INSTANCE = Mappers.getMapper(LancamentoMapper.class);
    LancamentoDto toLancamentoDto (Lancamento lancamento);

}
