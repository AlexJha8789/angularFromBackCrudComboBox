package com.sistemabackherrera.service;

import com.sistemabackherrera.dtos.MarcaCreateDTO;
import com.sistemabackherrera.dtos.MarcaDTO;
import com.sistemabackherrera.dtos.MarcaUpdateDTO;

import java.util.List;

public interface MarcaService {
    List<MarcaDTO> listarMarcas();
    MarcaDTO obtenerMarcaPorID(long id);
    MarcaDTO registrarMarca(MarcaCreateDTO marcaCreateDTO);
    MarcaDTO actualizarMarca(MarcaUpdateDTO marcaUpdateDTO);
    MarcaDTO eliminarMarca(long id);
}
