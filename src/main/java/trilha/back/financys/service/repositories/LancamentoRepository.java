package trilha.back.financys.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import trilha.back.financys.model.Categoria;
import trilha.back.financys.model.Lancamento;

import java.util.Optional;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

    Optional<Categoria> findById(Categoria CategoryId);

}

