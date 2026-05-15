    CREATE TABLE peliculas (
    peliculaId          BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombrePelicula      VARCHAR(150) NOT NULL,
    duracion            INT NOT NULL,
    clasificacion       VARCHAR(100) NOT NULL
);