package trilha.back.financys.service.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.model.Categoria;
import trilha.back.financys.service.repositories.CategoriaRepository;

import java.util.Optional;

@Service
public interface CategoriaService {

    public Long idCategoryByName(Categoria name);

}
