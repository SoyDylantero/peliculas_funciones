package void_cine.pelicula_funciones.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import void_cine.pelicula_funciones.model.Funcion;

@Repository
public interface FuncionRepository extends JpaRepository<Funcion, Long>{

    List<Funcion> findByPelicula(Long peliculaId);

}
