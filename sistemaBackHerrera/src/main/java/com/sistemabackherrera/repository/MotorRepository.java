package com.sistemabackherrera.repository;

import com.sistemabackherrera.model.Motor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotorRepository extends JpaRepository<Motor,Long> {
}
