package com.sistemabackherrera.dtos;


import com.sistemabackherrera.model.Color;
import com.sistemabackherrera.model.Marca;
import com.sistemabackherrera.model.Motor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
public class AutomovilDTO {

    private Long id;
    private Marca marca;
    private Motor motor;
    private Color color;
    private Long anioFabricacion;
    private BigDecimal cilindrada;
    private Long numPuertas;
    private BigDecimal precio;
}
