package void_cine.pelicula_funciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import void_cine.pelicula_funciones.model.Pelicula;
import java.util.List;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula,Long>{

    List<Pelicula> findByNombrePeliculaIgnoreCase(String nombrePelicula);

}
