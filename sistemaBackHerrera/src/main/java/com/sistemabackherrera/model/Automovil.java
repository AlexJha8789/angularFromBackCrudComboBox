package com.sistemabackherrera.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="tb_automovil")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Automovil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne()
    @JoinColumn(name="id_marca")
    private Marca marca;

    @OneToOne()
    @JoinColumn(name="id_motor")
    private Motor motor;

    @OneToOne()
    @JoinColumn(name="id_color")
    private Color color;

    @Column(nullable = false)
    private Long anioFabricacion;

    @Column(nullable = false)
    private BigDecimal cilindrada;

    @Column(nullable = false)
    private Long numPuertas;

    @Column(nullable = false)
    private BigDecimal precio;

}
