package trilha.back.financys.service.services;

import trilha.back.financys.model.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {

    Long idCategoryByName(Categoria name);

    List<Categoria> read();

    Optional<Categoria> findById(Long id);

    Categoria create(Categoria categoria);

    Categoria update(Categoria categoria);

    void delete(Categoria categoria);
}
