package com.sistemabackherrera.service;

import com.sistemabackherrera.dtos.MotorCreateDTO;
import com.sistemabackherrera.dtos.MotorDTO;
import com.sistemabackherrera.dtos.MotorUpdateDTO;

import java.util.List;

public interface MotorService {
    List<MotorDTO> listarMotors();
    MotorDTO obtenerMotorPorID(long id);
    MotorDTO registrarMotor(MotorCreateDTO motorCreateDTO);
    MotorDTO actualizarMotor(MotorUpdateDTO motorUpdateDTO);
    MotorDTO eliminarMotor(long id);
}
