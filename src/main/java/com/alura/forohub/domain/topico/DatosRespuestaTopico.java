package com.alura.forohub.domain.topico;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(
        Long id,
        String mensaje,
        String titulo,
        Boolean status,
        Curso nombreCurso,
        String autor,
        LocalDateTime fechaCreacion
) {
}
