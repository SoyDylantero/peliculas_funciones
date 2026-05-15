package void_cine.pelicula_funciones.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import void_cine.pelicula_funciones.model.Funcion;
import void_cine.pelicula_funciones.repository.FuncionRepository;

@Service
public class FuncionService {

    @Autowired
    private FuncionRepository funcionRepositorio;

    @Autowired
    private WebClient.Builder webclient;

    public List<Funcion> obtenerTodo(){
        return funcionRepositorio.findAll();

    }

    public boolean crearFuncion(Funcion f){
        funcionRepositorio.save(f);
        return false;

    }

    public Optional<Funcion> buscarPorId(Long id){
        return funcionRepositorio.findById(id);
    }

    

}
