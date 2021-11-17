package trilha.back.financys.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import trilha.back.financys.Entitys.Categoria;

import java.util.Optional;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {


    Optional<Categoria> findByName(String name);
    Optional<Categoria> findById(Categoria categoryId);

}
