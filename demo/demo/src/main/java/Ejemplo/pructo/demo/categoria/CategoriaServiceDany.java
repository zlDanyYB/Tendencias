package Ejemplo.pructo.demo.categoria;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class CategoriaServiceDany {
    @Autowired
    private CategoriaRepositoryDany categoriaRepositoryDany;

    //create
    public CategoriaDany save(CategoriaDany entity)
    {
        return categoriaRepositoryDany.save(entity);
    }


    //findbyid
    public CategoriaDany findById(Long id)
    {
        return categoriaRepositoryDany.findById(id).orElse(null);
    }

    //delete

    public void deleteByname(String name)
    {
        categoriaRepositoryDany.deleteByname(name);
        {
            categoriaRepositoryDany.deleteByname(name);
        }
    }

    //select all
    public List<CategoriaDany> findAll()
    {
        return categoriaRepositoryDany.findAll();
    }
        
    
}
