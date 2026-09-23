package br.com.etechoracio.ingresso.service;

import br.com.etechoracio.ingresso.dto.SalaResponseDTO;
import br.com.etechoracio.ingresso.mapper.SalaMapper;
import br.com.etechoracio.ingresso.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaService {
    @Autowired
    private SalaRepository repository;
    @Autowired
    private SalaMapper mapper;

    public List<SalaResponseDTO> listarAtivas() {
        return mapper.toDTOList(repository.findByDataExclusaoIsNull());
    }
}
