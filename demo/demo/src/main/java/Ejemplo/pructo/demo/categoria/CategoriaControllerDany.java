package Ejemplo.pructo.demo.categoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/categoriaDany")
public class CategoriaControllerDany {
    @Autowired
    private CategoriaServiceDany categoriaServiceDany;

    //create
    @PostMapping("/")
    public CategoriaDany save(@RequestBody CategoriaDany entity)
    {
        return categoriaServiceDany.save(entity);
    }

    //select by id
    @GetMapping("/{id}")
    public CategoriaDany findById(@PathVariable Long id)
    {
        return categoriaServiceDany.findById(id);
    }

    //update
    @PutMapping("/")
    public CategoriaDany Update(@RequestBody CategoriaDany entity)
    {
        return categoriaServiceDany.save(entity);
    }
    

    //Delete
    @DeleteMapping("/{name}")
    public void deleteByname(@PathVariable String name)
    {
        categoriaServiceDany.deleteByname(name);
    }

    //select all
    @GetMapping("/")
    public List<CategoriaDany> findAll()
    {
        return categoriaServiceDany.findAll();
    }

    



}
