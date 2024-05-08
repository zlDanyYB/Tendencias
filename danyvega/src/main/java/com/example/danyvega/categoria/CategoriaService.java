package com.example.danyvega.categoria;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    //create
    public Categoria save(Categoria entity)
    {
        return categoriaRepository.save(entity);
    }


    //findbyid
    public Categoria findById(Long id)
    {
        return categoriaRepository.findById(id).orElse(null);
    }

    //delete

    public void deleteById( long id)
    {
        categoriaRepository.deleteById(id);
        {
            categoriaRepository.deleteById(id);
        }
    }

    //select all
    public List<Categoria> findAll()
    {
        return categoriaRepository.findAll();
    }
        
    
}
