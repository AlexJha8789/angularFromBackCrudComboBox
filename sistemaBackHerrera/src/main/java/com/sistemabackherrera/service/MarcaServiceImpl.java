package com.sistemabackherrera.service;

import com.sistemabackherrera.dtos.MarcaCreateDTO;
import com.sistemabackherrera.dtos.MarcaDTO;
import com.sistemabackherrera.dtos.MarcaUpdateDTO;
import com.sistemabackherrera.mappers.MarcaMapper;
import com.sistemabackherrera.model.Marca;
import com.sistemabackherrera.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class MarcaServiceImpl implements MarcaService{

    @Autowired
    private MarcaRepository marcaRepository;
    @Override
    public List<MarcaDTO> listarMarcas() {
        return MarcaMapper.instancia.listaMarcaAListaMarcaDTO( marcaRepository.findAll());
    }

    @Override
    public MarcaDTO obtenerMarcaPorID(long id) {
        Optional<Marca> marca= marcaRepository.findById(id);
        MarcaDTO marcaDTO =null;
        if(marca.isPresent()){
            marcaDTO = MarcaMapper.instancia.marcaAMarcaDTO(marca.get());
        }
        return  marcaDTO;
    }

    @Override
    public MarcaDTO registrarMarca(MarcaCreateDTO marcaCreateDTO) {
        Marca marca=MarcaMapper.instancia.marcaCreateDTOAMarca(marcaCreateDTO);
        Marca respuestaEntity=marcaRepository.save(marca);
        MarcaDTO respuestaDTO= MarcaMapper.instancia.marcaAMarcaDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public MarcaDTO actualizarMarca(MarcaUpdateDTO marcaUpdateDTO) {
        Marca marca=MarcaMapper.instancia.marcaUpdateDTOAMarca(marcaUpdateDTO);
        Marca respuestaEntity=marcaRepository.save(marca);
        MarcaDTO respuestaDTO= MarcaMapper.instancia.marcaAMarcaDTO(respuestaEntity);
        return respuestaDTO;
    }

    @Override
    public MarcaDTO eliminarMarca(long id) {
        Optional<Marca> marcaOptional = marcaRepository.findById(id);
        if (marcaOptional.isPresent()) {
            MarcaDTO marcaDTO = MarcaMapper.instancia.marcaAMarcaDTO(marcaOptional.get());
            marcaRepository.delete(marcaOptional.get());
            return marcaDTO;
        } else {
            throw new NoSuchElementException("No se pudo realizar la eliminación para el ID proporcionado");
        }
    }
}
