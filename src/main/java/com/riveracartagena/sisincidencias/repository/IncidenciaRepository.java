package com.riveracartagena.sisincidencias.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riveracartagena.sisincidencias.entity.Incidencia;

@Repository
public interface IncidenciaRepository extends JpaRepository<Incidencia, Integer> {
	List<Incidencia> findByReferenciaContaining(String texto);
	Incidencia findByReferencia(String texto);
}
