package com.alura.forohub.domain.topico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

public interface TopicoRespository extends JpaRepository<Topico,Long> {

    Page<Topico> findByStatusTrue(Pageable paginacion);
}
