package Ejemplo.pructo.demo.libro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class LibroServiceDany {

    @Autowired
    private LibroRepositoryDany libroRepositoryDany;

    //metodo create
    public LibroDany save(LibroDany entity){
        return libroRepositoryDany.save(entity);
    }

    //metodo select by id
   
    public LibroDany findById(Long id)
    {
        return libroRepositoryDany.findById(id).orElse(null);
    }

   //metodo delete
   public void deleteBytitulo(String titulo)
   {
    libroRepositoryDany.deleteBytitulo(titulo);
    {
        libroRepositoryDany.deleteBytitulo(titulo);
    }
   }        

   //metodo select all
   public List<LibroDany> findAll()
   {
    return libroRepositoryDany.findAll();
   }
    
}
