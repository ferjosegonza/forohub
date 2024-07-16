package com.alura.forohub.domain.topico;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.Valid;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String autor,

        @Valid
        @NotNull
        Curso nombreCurso
) {
}
