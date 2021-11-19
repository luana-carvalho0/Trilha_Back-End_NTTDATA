package trilha.back.financys.entitys;


import javax.persistence.*;

@Entity
public class Lancamento {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    String name;
    String description;
    String type;
    String amount;
    String date;
    Boolean paid;
    @ManyToOne
    @JoinColumn(name = "categoryId", referencedColumnName = "id")
    Categoria categoryId;

    public Lancamento(){

    }

    public Lancamento(Long id, String name, String description, String type, String amount, String date, Boolean paid, Categoria categoryId){
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.paid = paid;
        this.categoryId = categoryId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public Boolean getPaid() {
        return paid;
    }

    public Categoria getCategoryId() {
        return categoryId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public void setCategoryId(Categoria categoryId) {
        this.categoryId = categoryId;
    }

    public String toString() {
        return "Id do lançamento.:" + this.id + ",, "
                + "nome do lançamento.:" + this.name + ",, "
                + "descrição do lançamento.:" + this.description + ",, "
                + "tipo do lançamento.:" + this.type + ",, "
                + "mês do lançamento.:" + this.amount + ",, "
                + "data do lançamento.:" + this.date + ",, "
                + "id da categoria.:" + this.categoryId;
    }

}