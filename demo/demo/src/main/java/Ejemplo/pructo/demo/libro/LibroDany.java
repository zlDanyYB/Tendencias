package Ejemplo.pructo.demo.libro;

import java.sql.Date;
import Ejemplo.pructo.demo.categoria.CategoriaDany;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity

public class LibroDany {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private int pages;
    private Date created;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
  
    public CategoriaDany getCategoriaDany() {
        return categoriaDany;
    }

    public void setCategoriaDany(CategoriaDany categoriaDany) {
        this.categoriaDany = categoriaDany;
    }

    @ManyToOne
    private CategoriaDany categoriaDany;

}
