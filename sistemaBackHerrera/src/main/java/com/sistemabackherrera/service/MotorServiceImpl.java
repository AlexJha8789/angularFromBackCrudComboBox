package com.sistemabackherrera.service;

import com.sistemabackherrera.dtos.MotorCreateDTO;
import com.sistemabackherrera.dtos.MotorDTO;
import com.sistemabackherrera.dtos.MotorUpdateDTO;
import com.sistemabackherrera.mappers.MotorMapper;
import com.sistemabackherrera.model.Motor;
import com.sistemabackherrera.repository.MotorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class MotorServiceImpl implements MotorService{

    @Autowired
    private MotorRepository motorRepository;

    @Override
    public List<MotorDTO> listarMotors() {
        return MotorMapper.instancia.listaMotorAListaMotorDTO( motorRepository.findAll());
    }

    @Override
    public MotorDTO obtenerMotorPorID(long id) {
        Optional<Motor> motor= motorRepository.findById(id);
        MotorDTO motorDTO =null;
        if(motor.isPresent()){
            motorDTO = MotorMapper.instancia.motorAMotorDTO(motor.get());
        }
        return  motorDTO;
    }

    @Override
    public MotorDTO registrarMotor(MotorCreateDTO motorCreateDTO) {
        Motor motor=MotorMapper.instancia.motorCreateDTOAMotor(motorCreateDTO);
        Motor respuestaEntity=motorRepository.save(motor);
        MotorDTO respuestaDTO= MotorMapper.instancia.motorAMotorDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public MotorDTO actualizarMotor(MotorUpdateDTO motorUpdateDTO) {
        Motor motor=MotorMapper.instancia.motorUpdateDTOAMotor(motorUpdateDTO);
        Motor respuestaEntity=motorRepository.save(motor);
        MotorDTO respuestaDTO= MotorMapper.instancia.motorAMotorDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public MotorDTO eliminarMotor(long id) {
        Optional<Motor> motorOptional = motorRepository.findById(id);
        if (motorOptional.isPresent()) {
            MotorDTO motorDTO = MotorMapper.instancia.motorAMotorDTO(motorOptional.get());
            motorRepository.delete(motorOptional.get());
            return motorDTO;
        } else {
            throw new NoSuchElementException("No se pudo realizar la eliminación para el ID proporcionado");
        }
    }
}
