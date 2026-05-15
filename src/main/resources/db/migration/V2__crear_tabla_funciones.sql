CREATE TABLE funciones(
    funcionId          BIGINT AUTO_INCREMENT PRIMARY KEY,
    hora_funcion       DATETIME NOT NULL,
    precio             DOUBLE NOT NULL,
    peliculaId         BIGINT NOT NULL,
    theater_id         BIGINT NOT NULL,
    available_seats    INT NOT NULL,

    CONSTRAINT fk_pelicula_funcion FOREIGN KEY (peliculaId) REFERENCES peliculas(peliculaId)
);