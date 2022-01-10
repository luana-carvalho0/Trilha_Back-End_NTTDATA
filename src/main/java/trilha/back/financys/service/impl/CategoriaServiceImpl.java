package trilha.back.financys.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trilha.back.financys.model.Categoria;
import trilha.back.financys.service.repositories.CategoriaRepository;
import trilha.back.financys.service.services.CategoriaService;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

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

    @Override
    public List<Categoria> read(){
        return categoriaRepository.findAll();
    }


    @Override
    public Optional<Categoria> findById(Long id){

        return categoriaRepository.findById(id);

    }

    @Override
    public Categoria create(Categoria categoria){
        return categoriaRepository.save(categoria);
    }


    @Override
    public Categoria atualizarCategoria(Long id, Categoria categoria) {
        Categoria cat = categoriaRepository.findById(id).get();
        return categoriaRepository.save(atualizada(cat, categoria));

    }

    public Categoria atualizada(Categoria cat, Categoria categoria) {
        cat.setName(categoria.getName());
        cat.setDescription(categoria.getDescription());
        return cat;
    }

    @Override
    public void delete(Long id){

        Categoria categoria = findById(id).get();
        categoriaRepository.delete(categoria);

    }

}
