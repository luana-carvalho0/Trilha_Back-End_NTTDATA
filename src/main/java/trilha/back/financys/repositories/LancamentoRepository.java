package trilha.back.financys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import trilha.back.financys.entitys.Categoria;
import trilha.back.financys.entitys.Lancamento;

import java.util.Optional;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

    Optional<Categoria> findById(Categoria CategoryId);

}

