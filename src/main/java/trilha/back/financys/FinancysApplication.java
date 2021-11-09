package trilha.back.financys;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import trilha.back.financys.Entitys.Categoria;
import trilha.back.financys.Entitys.Lancamento;

@SpringBootApplication
public class FinancysApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancysApplication.class, args);

		Categoria c1 = new Categoria( 4, "Salário", "Recebimento de Salário");
		Lancamento l1 = new Lancamento(3, "Salário na empresa Everis", "Adiantamento quinzenal", "revenue", "4405,49", "15/09/2021", true, 4);

		Categoria c2 = new Categoria();
		c2.setId(4);
		c2.setName("Salário");
		c2.setDescription("Recebimento de Salário");
		System.out.println(c2.getId());
		System.out.println(c2.getName());
		System.out.println(c2.getDescription());

		System.out.println(c2.toString());

		Lancamento l2 = new Lancamento();
		l2.setId(3);
		l2.setName("Salário na empresa Everis");
		l2.setDescription("Adiantamento quinzenal");
		l2.setType("revenue");
		l2.setAmount("4405,49");
		l2.setDate("15/09/2021");
		l2.setPaid(true);
		l2.setCategoryId(4);
		System.out.println(l2.getId());
		System.out.println(l2.getName());
		System.out.println(l2.getDescription());
		System.out.println(l2.getType());
		System.out.println(l2.getAmount());
		System.out.println(l2.getDate());
		System.out.println(l2.getPaid());
		System.out.println(l2.getCategoryId());

		System.out.println(l2.toString());
	}

}