package trilha.back.financys.service.services;

import org.springframework.stereotype.Service;
import trilha.back.financys.model.Categoria;


@Service
public interface CategoriaService {

    public Long idCategoryByName(Categoria name);

}
