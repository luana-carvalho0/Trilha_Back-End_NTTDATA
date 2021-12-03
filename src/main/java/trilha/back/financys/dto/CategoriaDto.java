package trilha.back.financys.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import trilha.back.financys.entitys.Categoria;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonAutoDetect(getterVisibility= JsonAutoDetect.Visibility.NONE)
public class CategoriaDto {

    @NotBlank(message = "Campo nome não informado")
    @Min(value = 3) @Max(value = 15)
    String name;
    @NotBlank(message = "Campo description não informado")
    @Min(value = 15) @Max(value = 50)
    String description;

    public CategoriaDto(Categoria categoria){
        this.name = categoria.getName();
        this.description = categoria.getDescription();
    }

    public static List<CategoriaDto> convert(List<Categoria> lista){
        return lista.stream().map(CategoriaDto::new).collect(Collectors.toList());
    }
}
