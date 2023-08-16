package com.sistemabackherrera.controller;


import com.sistemabackherrera.dtos.ColorCreateDTO;
import com.sistemabackherrera.dtos.ColorDTO;
import com.sistemabackherrera.dtos.ColorUpdateDTO;
import com.sistemabackherrera.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ColorController {

    @Autowired
    private ColorService colorService;

    @GetMapping("colors")
    public ResponseEntity<List<ColorDTO>> listarColors(){
        return   new ResponseEntity<>(colorService.listarColors(), HttpStatus.OK);
    }

    @GetMapping("/colors/{colorId}")
    public ResponseEntity<ColorDTO> obtenerColorPorId(@PathVariable("colorId") long colorId){
        return  new ResponseEntity<> ( colorService.obtenerColorPorID(colorId),HttpStatus.OK);
    }

    @PostMapping("colors")
    public ResponseEntity<ColorDTO> registrarColor(@RequestBody ColorCreateDTO colorCreateDTO){
        return  new ResponseEntity<>( colorService.registrarColor(colorCreateDTO) , HttpStatus.OK) ;
    }

    @PutMapping("colors")
    public ResponseEntity<ColorDTO> actualizarColor(@RequestBody ColorUpdateDTO colorUpdateDTO){
        return new ResponseEntity<>(colorService.actualizarColor(colorUpdateDTO),HttpStatus.OK);
    }

    @DeleteMapping("/colors/{colorId}")
    public ResponseEntity<ColorDTO> eliminarColor(@PathVariable("colorId") long colorId) {
        return new ResponseEntity<>( colorService.eliminarColor(colorId),HttpStatus.OK);
    }
}
