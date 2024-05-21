package Ejemplo.pructo.demo.categoria;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CategoriaRepositoryDany extends CrudRepository<CategoriaDany, Long>  {
    @SuppressWarnings("null")
    List<CategoriaDany> findAll();

    void deleteByname(String name);

    @SuppressWarnings({ "unchecked", "null" })
    CategoriaDany save(CategoriaDany entity);
}
