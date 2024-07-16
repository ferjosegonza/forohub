package com.alura.forohub.domain.topico;

import jakarta.validation.constraints.NotNull;

public record ActualizarTopico(
       @NotNull
        Long id,
        String nombreCurso,
        String mensaje,
        String titulo,
        boolean status

) {
}
