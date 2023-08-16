package com.sistemabackherrera.mappers;

import com.sistemabackherrera.dtos.AutomovilCreateDTO;
import com.sistemabackherrera.dtos.AutomovilDTO;
import com.sistemabackherrera.dtos.AutomovilUpdateDTO;
import com.sistemabackherrera.model.Automovil;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AutomovilMapper {
    AutomovilMapper instancia= Mappers.getMapper(AutomovilMapper.class);

    AutomovilDTO automovilAAutomovilDTO(Automovil automovil);
    Automovil automovilDTOAAutomovil(AutomovilDTO automovilDTO);
    Automovil automovilCreateDTOAAutomovil(AutomovilCreateDTO automovilCreateDTO);
    Automovil automovilUpdateDTOAAutomovil(AutomovilUpdateDTO automovilUpdateDTO);
    List<AutomovilDTO> listaAutomovilAListaAutomovilDTO (List<Automovil> listaAutomovil);

}
