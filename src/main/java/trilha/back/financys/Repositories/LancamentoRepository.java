package trilha.back.financys.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import trilha.back.financys.Entitys.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {


}
