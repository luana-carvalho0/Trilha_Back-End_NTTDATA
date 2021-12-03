package trilha.back.financys.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.entitys.Categoria;
import trilha.back.financys.repositories.CategoriaRepository;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Long idCategoryByName(Categoria name){

        Optional<Categoria> categoriaName = categoriaRepository.findByName(name.getName());

        if(categoriaName.isPresent())
            return categoriaName.get().getId();
        else
            System.out.println("Nome não encontrado");

        return categoriaName.get().getId();


    }

}