package trilha.back.financys.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import trilha.back.financys.entitys.Categoria;
import trilha.back.financys.entitys.Lancamento;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaDto {

    String name;
    String description;

    public CategoriaDto(Categoria categoria){
        this.name = categoria.getName();
        this.description = categoria.getDescription();
    }

    public static List<CategoriaDto> convert(List<Categoria> lista){
        return lista.stream().map(CategoriaDto::new).collect(Collectors.toList());
    }
}
