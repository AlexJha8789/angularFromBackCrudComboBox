package com.sistemabackherrera.service;

import com.sistemabackherrera.dtos.AutomovilCreateDTO;
import com.sistemabackherrera.dtos.AutomovilDTO;
import com.sistemabackherrera.dtos.AutomovilUpdateDTO;
import com.sistemabackherrera.mappers.AutomovilMapper;
import com.sistemabackherrera.model.Automovil;
import com.sistemabackherrera.repository.AutomovilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class AutomovilServiceImpl implements AutomovilService{

    @Autowired
    private AutomovilRepository automovilRepository;
    @Override
    public List<AutomovilDTO> listarAutomovils() {
        return AutomovilMapper.instancia.listaAutomovilAListaAutomovilDTO( automovilRepository.findAll());
    }

    @Override
    public AutomovilDTO obtenerAutomovilPorID(long id) {
        Optional<Automovil> automovil= automovilRepository.findById(id);
        AutomovilDTO automovilDTO =null;
        if(automovil.isPresent()){
            automovilDTO = AutomovilMapper.instancia.automovilAAutomovilDTO(automovil.get());
        }
        return  automovilDTO;
    }

    @Override
    public AutomovilDTO registrarAutomovil(AutomovilCreateDTO automovilCreateDTO) {
        Automovil automovil=AutomovilMapper.instancia.automovilCreateDTOAAutomovil(automovilCreateDTO);
        Automovil respuestaEntity=automovilRepository.save(automovil);
        AutomovilDTO respuestaDTO= AutomovilMapper.instancia.automovilAAutomovilDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public AutomovilDTO actualizarAutomovil(AutomovilUpdateDTO automovilUpdateDTO) {
        Automovil automovil=AutomovilMapper.instancia.automovilUpdateDTOAAutomovil(automovilUpdateDTO);
        Automovil respuestaEntity=automovilRepository.save(automovil);
        AutomovilDTO respuestaDTO= AutomovilMapper.instancia.automovilAAutomovilDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public AutomovilDTO eliminarAutomovil(long id) {
        Optional<Automovil> automovilOptional = automovilRepository.findById(id);
        if (automovilOptional.isPresent()) {
            AutomovilDTO automovilDTO = AutomovilMapper.instancia.automovilAAutomovilDTO(automovilOptional.get());
            automovilRepository.delete(automovilOptional.get());
            return automovilDTO;
        } else {
            throw new NoSuchElementException("No se pudo realizar la eliminación para el ID proporcionado");
        }
    }
}
