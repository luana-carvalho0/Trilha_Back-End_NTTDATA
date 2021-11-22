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
public class LancamentoDto {

    String name;
    String description;
    String type;
    String amount;
    String date;
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
