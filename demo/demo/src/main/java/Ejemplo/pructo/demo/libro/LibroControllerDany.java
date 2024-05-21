package Ejemplo.pructo.demo.libro;

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
@RequestMapping("/libroDany")
public class LibroControllerDany {

    @Autowired
    private LibroServiceDany libroServiceDany;

    @PostMapping("/")
    public LibroDany save(@RequestBody LibroDany entity)
    {
        return libroServiceDany.save(entity);
    }

    //api find by id
     @GetMapping("/{id}")
    public LibroDany findById(@PathVariable Long id)
    {
        return libroServiceDany.findById(id);
    }

    //api update
    @PutMapping("/")
    public LibroDany update(@RequestBody LibroDany entity)
    {
        return libroServiceDany.save(entity);
    }

        //metodo delete
    @DeleteMapping("/titulo/{titulo}")
    public void delete(@PathVariable String titulo)
    {
        libroServiceDany.deleteBytitulo(titulo);
    }

    //metodo select all
    @GetMapping("/")
    public List<LibroDany> findAll()
    {
        return libroServiceDany.findAll();
    }
    
}
