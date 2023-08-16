package com.sistemabackherrera.repository;

import com.sistemabackherrera.model.Automovil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomovilRepository extends JpaRepository<Automovil,Long> {
}
