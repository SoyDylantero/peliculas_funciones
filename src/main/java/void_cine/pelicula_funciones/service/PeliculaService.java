package void_cine.pelicula_funciones.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import void_cine.pelicula_funciones.model.Pelicula;
import void_cine.pelicula_funciones.repository.PeliculaRepository;

@Service
public class PeliculaService {

    @Autowired
    private PeliculaRepository peliculaRepositorio;

    public List<Pelicula> listarTodo(){
        return peliculaRepositorio.findAll();
    }

    public Pelicula guardar(Pelicula peli){
        return peliculaRepositorio.save(peli);
    }

    public Pelicula buscarPorId(Long id){
        return peliculaRepositorio.findById(id).orElseThrow(() -> new RuntimeException("Pelicula No Encontrada con ID: " + id));
    }

    public boolean eliminar(Long id){
        peliculaRepositorio.deleteById(id);
        return false;
    }

}
