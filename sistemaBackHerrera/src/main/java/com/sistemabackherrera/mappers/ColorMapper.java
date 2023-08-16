package com.sistemabackherrera.mappers;

import com.sistemabackherrera.dtos.ColorCreateDTO;
import com.sistemabackherrera.dtos.ColorDTO;
import com.sistemabackherrera.dtos.ColorUpdateDTO;
import com.sistemabackherrera.model.Color;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ColorMapper {
    ColorMapper instancia= Mappers.getMapper(ColorMapper.class);

    ColorDTO colorAColorDTO(Color color);
    Color colorDTOAColor(ColorDTO colorDTO);
    Color colorCreateDTOAColor(ColorCreateDTO colorCreateDTO);
    Color colorUpdateDTOAColor(ColorUpdateDTO colorUpdateDTO);
    List<ColorDTO> listaColorAListaColorDTO (List<Color> listaColor);
}
