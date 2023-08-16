package com.sistemabackherrera.controller;


import com.sistemabackherrera.dtos.AutomovilCreateDTO;
import com.sistemabackherrera.dtos.AutomovilDTO;
import com.sistemabackherrera.dtos.AutomovilUpdateDTO;
import com.sistemabackherrera.service.AutomovilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class AutomovilController {

    @Autowired
    private AutomovilService automovilService;

    @GetMapping("automovils")
    public ResponseEntity<List<AutomovilDTO>> listarAutomovils(){
        return   new ResponseEntity<>(automovilService.listarAutomovils(), HttpStatus.OK);
    }

    @GetMapping("/automovils/{automovilId}")
    public ResponseEntity<AutomovilDTO> obtenerAutomovilPorId(@PathVariable("automovilId") long automovilId){
        return  new ResponseEntity<> ( automovilService.obtenerAutomovilPorID(automovilId),HttpStatus.OK);
    }

    @PostMapping("automovils")
    public ResponseEntity<AutomovilDTO> registrarAutomovil(@RequestBody AutomovilCreateDTO automovilCreateDTO){
        return  new ResponseEntity <>( automovilService.registrarAutomovil(automovilCreateDTO) ,HttpStatus.OK) ;
    }

    @PutMapping("automovils")
    public ResponseEntity<AutomovilDTO> actualizarAutomovil(@RequestBody AutomovilUpdateDTO automovilUpdateDTO){
        return new ResponseEntity<>(automovilService.actualizarAutomovil(automovilUpdateDTO),HttpStatus.OK);
    }

    @DeleteMapping("/automovils/{automovilId}")
    public ResponseEntity<AutomovilDTO> eliminarAutomovil(@PathVariable("automovilId") long automovilId) {
        return new ResponseEntity<>( automovilService.eliminarAutomovil(automovilId),HttpStatus.OK);
    }
}
