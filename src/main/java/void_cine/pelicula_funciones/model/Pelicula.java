package void_cine.pelicula_funciones.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "peliculas")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long peliculaId;

    @Column(name = "nombre", nullable = false, length = 200)
    private String nombrePelicula;

    private int duracion;
    private String calsificacion;
}
