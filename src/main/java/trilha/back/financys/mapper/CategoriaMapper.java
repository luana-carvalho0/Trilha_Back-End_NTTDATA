package trilha.back.financys.mapper;

import org.mapstruct.Mapper;
import trilha.back.financys.dto.CategoriaDto;
import trilha.back.financys.dto.LancamentoDto;
import trilha.back.financys.entitys.Categoria;
import trilha.back.financys.entitys.Lancamento;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {

    //CategoriaMapper INSTANCE = Mappers.getMapper(CategoriaMapper.class);

    CategoriaDto toCategoriaDto (Categoria categoria);

}
