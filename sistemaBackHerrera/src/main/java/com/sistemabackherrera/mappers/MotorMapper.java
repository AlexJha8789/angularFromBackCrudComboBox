package com.sistemabackherrera.mappers;

import com.sistemabackherrera.dtos.MotorCreateDTO;
import com.sistemabackherrera.dtos.MotorDTO;
import com.sistemabackherrera.dtos.MotorUpdateDTO;
import com.sistemabackherrera.model.Motor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MotorMapper {
    MotorMapper instancia= Mappers.getMapper(MotorMapper.class);

    MotorDTO motorAMotorDTO(Motor motor);
    Motor motorDTOAMotor(MotorDTO motorDTO);
    Motor motorCreateDTOAMotor(MotorCreateDTO motorCreateDTO);
    Motor motorUpdateDTOAMotor(MotorUpdateDTO motorUpdateDTO);
    List<MotorDTO> listaMotorAListaMotorDTO (List<Motor> listaMotor);
}
