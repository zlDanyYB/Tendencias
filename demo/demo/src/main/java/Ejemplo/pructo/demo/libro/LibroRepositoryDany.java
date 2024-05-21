package Ejemplo.pructo.demo.libro;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import jakarta.transaction.Transactional;

public interface LibroRepositoryDany extends CrudRepository<LibroDany, Long> {
    @SuppressWarnings("null")
    List<LibroDany> findAll();
    @Transactional
    void deleteBytitulo(String titulo);
}
