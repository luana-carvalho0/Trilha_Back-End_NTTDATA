package trilha.back.financys.Entitys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categoria {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String description;

    public Categoria(){

    }

    public Categoria(Long id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Id da categoria.:" + this.id + ",, "
                + "nome da categoria.:" + this.name + ",, "
                + "descrição da categoria.:" + this.description;
    }

}