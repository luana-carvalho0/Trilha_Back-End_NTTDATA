package trilha.back.financys.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.Entitys.Categoria;
import trilha.back.financys.Repositories.CategoriaRepository;
import trilha.back.financys.Repositories.LancamentoRepository;

import java.util.Optional;


@Service
public class LancamentoService {

    @Autowired
    private LancamentoRepository lancamentoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    public boolean validateCategoryById(Categoria idCategory){

        Optional<Categoria> idcategory = categoriaRepository.findById(idCategory.getId());

        if(idcategory.isPresent())
            return true;
        else
            return false;

    }
}