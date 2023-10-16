package com.utn.PersistenciaJPA.repositorios;

import com.utn.PersistenciaJPA.entidades.Rubro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RubroRepository extends JpaRepository<Rubro,Long> {
}
