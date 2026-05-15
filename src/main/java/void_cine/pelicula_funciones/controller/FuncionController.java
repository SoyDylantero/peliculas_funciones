package void_cine.pelicula_funciones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import void_cine.pelicula_funciones.model.Funcion;
import void_cine.pelicula_funciones.service.FuncionService;

@RestController
@RequestMapping("/api/funcion")
public class FuncionController {

    @Autowired
    private FuncionService funcionServicio;

    @GetMapping("/")
    public ResponseEntity<List<Funcion>> mostrarFunciones(){
        return ResponseEntity.status(HttpStatus.OK).body(funcionServicio.obtenerTodo());

    }

    @PostMapping("/")
    public ResponseEntity<?> guardarFuncion(@RequestBody Funcion f){
        boolean exito = funcionServicio.crearFuncion(f);
        if(exito){
            return ResponseEntity.status(HttpStatus.OK).body(funcionServicio.obtenerTodo());

        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("error al guardar funcion");
        }

    }


}
