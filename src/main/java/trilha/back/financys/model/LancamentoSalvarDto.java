package trilha.back.financys.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


public class LancamentoSalvarDto {

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

    @JsonProperty("categoryId")
    Long catId;

    public LancamentoSalvarDto() {
    }

    public LancamentoSalvarDto(String name, String description, String type, String amount, String date, Boolean paid, Long catId) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.paid = paid;
        this.catId = catId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }
}
