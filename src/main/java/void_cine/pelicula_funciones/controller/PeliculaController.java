package void_cine.pelicula_funciones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import void_cine.pelicula_funciones.model.Pelicula;
import void_cine.pelicula_funciones.service.PeliculaService;

@RestController
@RequestMapping("/api/pelicula")
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaServicio;

    @GetMapping
    public ResponseEntity<List<Pelicula>> obtenerTodas(){
        return ResponseEntity.status(HttpStatus.OK).body(peliculaServicio.listarTodo());
    }

    @PostMapping
    public ResponseEntity<Pelicula> crear(@RequestBody Pelicula peli){
        return ResponseEntity.status(HttpStatus.CREATED).body(peliculaServicio.guardar(peli));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pelicula> obtenerPorId(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(peliculaServicio.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarPorId(@PathVariable Long id){
        boolean eliminado = peliculaServicio.eliminar(id);

        if(eliminado){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("no hay pelicula con el ID: " + id);
        }
        
    }



}
