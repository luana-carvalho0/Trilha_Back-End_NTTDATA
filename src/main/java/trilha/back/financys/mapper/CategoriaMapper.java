package trilha.back.financys.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import trilha.back.financys.dto.CategoriaDto;
import trilha.back.financys.entitys.Categoria;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {

    //CategoriaMapper INSTANCE = Mappers.getMapper(CategoriaMapper.class);

    CategoriaDto toCategoriaDto (Categoria categoria);
}
