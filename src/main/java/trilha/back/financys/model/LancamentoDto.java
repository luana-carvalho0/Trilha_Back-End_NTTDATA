package trilha.back.financys.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LancamentoDto {

    @NotBlank(message = "Campo nome não informado")
    @Min(value = 3) @Max(value = 45)
    String name;
    @NotBlank(message = "Campo description não informado")
    @Min(value = 15) @Max(value = 150)
    String description;
    @NotBlank(message = "Campo type não informado")
    @Min(value = 3) @Max(value = 10)
    String type;
    @NotBlank(message = "Campo amount não informado")
    String amount;
    @NotBlank(message = "Campo date não informado")
    String date;
    @NotBlank(message = "Campo paid não informado")
    Boolean paid;
    private Categoria categoryId;

    public LancamentoDto(Lancamento lancamento){
        this.name = lancamento.getName();
        this.description = lancamento.getDescription();
        this.type = lancamento.getType();
        this.amount = lancamento.getAmount();
        this.date = lancamento.getDate();
        this.paid = lancamento.getPaid();
        this.categoryId = lancamento.getCategoryId();
    }


    public static List<LancamentoDto> convert(List<Lancamento> lista2){
        return lista2.stream().map(LancamentoDto::new).collect(Collectors.toList());
    }


}
