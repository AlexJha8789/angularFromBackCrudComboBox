package com.sistemabackherrera.service;

import com.sistemabackherrera.dtos.AutomovilCreateDTO;
import com.sistemabackherrera.dtos.AutomovilDTO;
import com.sistemabackherrera.dtos.AutomovilUpdateDTO;

import java.util.List;

public interface AutomovilService {
    List<AutomovilDTO> listarAutomovils();
    AutomovilDTO obtenerAutomovilPorID(long id);
    AutomovilDTO registrarAutomovil(AutomovilCreateDTO automovilCreateDTO);
    AutomovilDTO actualizarAutomovil(AutomovilUpdateDTO automovilUpdateDTO);
    AutomovilDTO eliminarAutomovil(long id);
}
