package com.sistemabackherrera.mappers;

import com.sistemabackherrera.dtos.MarcaCreateDTO;
import com.sistemabackherrera.dtos.MarcaDTO;
import com.sistemabackherrera.dtos.MarcaUpdateDTO;
import com.sistemabackherrera.model.Marca;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MarcaMapper {
    MarcaMapper instancia= Mappers.getMapper(MarcaMapper.class);

    MarcaDTO marcaAMarcaDTO(Marca marca);
    Marca marcaDTOAMarca(MarcaDTO marcaDTO);
    Marca marcaCreateDTOAMarca(MarcaCreateDTO marcaCreateDTO);
    Marca marcaUpdateDTOAMarca(MarcaUpdateDTO marcaUpdateDTO);
    List<MarcaDTO> listaMarcaAListaMarcaDTO (List<Marca> listaMarca);
}
