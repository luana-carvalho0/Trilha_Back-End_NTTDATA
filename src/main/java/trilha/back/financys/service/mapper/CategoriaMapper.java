package trilha.back.financys.service.mapper;

import org.mapstruct.Mapper;
import trilha.back.financys.model.CategoriaDto;
import trilha.back.financys.model.Categoria;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {

    //CategoriaMapper INSTANCE = Mappers.getMapper(CategoriaMapper.class);

    CategoriaDto toCategoriaDto (Categoria categoria);

}
