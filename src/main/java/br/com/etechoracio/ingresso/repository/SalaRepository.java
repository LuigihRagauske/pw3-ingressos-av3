package br.com.etechoracio.ingresso.repository;

import br.com.etechoracio.ingresso.dto.SalaResponseDTO;
import br.com.etechoracio.ingresso.entity.Filme;
import br.com.etechoracio.ingresso.entity.Sala;
import br.com.etechoracio.ingresso.enums.SimNaoEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SalaRepository extends JpaRepository<Sala, Long> {

    List<Sala> findByDataExclusaoIsNull();
    Optional<Sala> findByIDAndDataExclusaoISNull(Long id);

    List<SalaResponseDTO> toRespondeDTO(List<Sala> salas);
}
