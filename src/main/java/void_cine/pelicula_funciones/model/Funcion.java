package void_cine.pelicula_funciones.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "funciones")
public class Funcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "funcionId")
    private long funcionId;

    @Column(name = "hora_funcion")
    private LocalDate horaFuncion;

    
    private Double precio;


    @Column(name = "peliculaId", nullable = false)
    private long pelicula;


    @Column(name = "theater_id", nullable = false)
    private Long theaterId;

    @Column(name = "available_seats", nullable = false)
    private Integer availableSeats;



}
