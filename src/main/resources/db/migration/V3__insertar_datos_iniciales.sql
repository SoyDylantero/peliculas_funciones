INSERT INTO peliculas (nombrePelicula, duracion, clasificacion) 
VALUES ('Batman', 175, '+13');

INSERT INTO peliculas (nombrePelicula, duracion, clasificacion) 
VALUES ('Frozen 2', 103, 'TE');

INSERT INTO peliculas (nombrePelicula, duracion, clasificacion) 
VALUES ('El Padrino', 175, '+18');


-- Ejemplo 1: Función para la película con ID 1
INSERT INTO funciones (hora_funcion, precio, peliculaId, theater_id, available_seats) 
VALUES ('2026-05-15 19:30:00', 5500.0, 1, 101, 40);

-- Ejemplo 2: Función para la película con ID 2
INSERT INTO funciones (hora_funcion, precio, peliculaId, theater_id, available_seats) 
VALUES ('2026-05-15 22:00:00', 4500.0, 2, 102, 35);

-- Ejemplo 3: Otra función para la película con ID 1 (en otra sala)
INSERT INTO funciones (hora_funcion, precio, peliculaId, theater_id, available_seats) 
VALUES ('2026-05-16 15:00:00', 5500.0, 1, 103, 50);