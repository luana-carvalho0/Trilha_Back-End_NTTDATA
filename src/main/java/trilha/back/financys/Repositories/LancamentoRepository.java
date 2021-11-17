package trilha.back.financys.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import trilha.back.financys.Entitys.Categoria;
import trilha.back.financys.Entitys.Lancamento;

import java.util.Optional;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

    Optional<Categoria> findById(Categoria CategoryId);

}

