package Modelos.Inventario;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "articulo")
public class Articulo implements Serializable {

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "NOMBRE")
    private String  name;

    public Articulo() {

    }

    public Articulo( String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id= id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
