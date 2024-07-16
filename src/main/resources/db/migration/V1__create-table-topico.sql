CREATE TABLE topicos (
    id BIGINT NOT NULL AUTO_INCREMENT,
    mensaje VARCHAR(400) NOT NULL,
    nombre_curso VARCHAR(100) NOT NULL,
    titulo VARCHAR(150) NOT NULL,
    status TINYINT NOT NULL,
    autor VARCHAR(100) NOT NULL,
    fecha_creacion DATETIME NOT NULL,
    PRIMARY KEY (id)
);
