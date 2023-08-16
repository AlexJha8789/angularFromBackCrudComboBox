package com.sistemabackherrera.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
public class MotorDTO {

    private Long id;
    private String desMotor;
}
