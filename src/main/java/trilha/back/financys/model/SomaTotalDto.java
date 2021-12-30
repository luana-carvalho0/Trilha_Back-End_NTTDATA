package trilha.back.financys.model;



import java.util.List;


public class SomaTotalDto {

    String name;
    List<Lancamento> total;


    public SomaTotalDto() {
    }

    public SomaTotalDto(String name, List<Lancamento> total) {
        this.name = name;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Lancamento> getTotal() {
        return total;
    }

    public void setTotal(List<Lancamento> total) {
        this.total = total;
    }
}

