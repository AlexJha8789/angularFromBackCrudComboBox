package com.sistemabackherrera.service;

import com.sistemabackherrera.dtos.ColorCreateDTO;
import com.sistemabackherrera.dtos.ColorDTO;
import com.sistemabackherrera.dtos.ColorUpdateDTO;

import java.util.List;

public interface ColorService {
    List<ColorDTO> listarColors();
    ColorDTO obtenerColorPorID(long id);
    ColorDTO registrarColor(ColorCreateDTO colorCreateDTO);
    ColorDTO actualizarColor(ColorUpdateDTO colorUpdateDTO);
    ColorDTO eliminarColor(long id);
}
