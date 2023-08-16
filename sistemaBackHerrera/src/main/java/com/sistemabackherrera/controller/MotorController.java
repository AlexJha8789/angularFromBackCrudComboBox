package com.sistemabackherrera.controller;


import com.sistemabackherrera.dtos.MotorCreateDTO;
import com.sistemabackherrera.dtos.MotorDTO;
import com.sistemabackherrera.dtos.MotorUpdateDTO;
import com.sistemabackherrera.service.MotorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class MotorController {
    @Autowired
    private MotorService motorService;

    @GetMapping("motors")
    public ResponseEntity<List<MotorDTO>> listarMotors(){
        return   new ResponseEntity<>(motorService.listarMotors(), HttpStatus.OK);
    }

    @GetMapping("/motors/{motorId}")
    public ResponseEntity<MotorDTO> obtenerMotorPorId(@PathVariable("motorId") long motorId){
        return  new ResponseEntity<> ( motorService.obtenerMotorPorID(motorId),HttpStatus.OK);
    }

    @PostMapping("motors")
    public ResponseEntity<MotorDTO> registrarMotor(@RequestBody MotorCreateDTO motorCreateDTO){
        return  new ResponseEntity <>( motorService.registrarMotor(motorCreateDTO) ,HttpStatus.OK) ;
    }

    @PutMapping("motors")
    public ResponseEntity<MotorDTO> actualizarMotor(@RequestBody MotorUpdateDTO motorUpdateDTO){
        return new ResponseEntity<>(motorService.actualizarMotor(motorUpdateDTO),HttpStatus.OK);
    }

    @DeleteMapping("/motors/{motorId}")
    public ResponseEntity<MotorDTO> eliminarMotor(@PathVariable("motorId") long motorId) {
        return new ResponseEntity<>( motorService.eliminarMotor(motorId),HttpStatus.OK);
    }
}
