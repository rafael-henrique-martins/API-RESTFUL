package rhm.domain.service;

import rhm.domain.dto.ClienteDTO;
import rhm.domain.entity.Cliente;

public interface ClienteService {
    Cliente salvar(ClienteDTO dto);

    Cliente delete(Integer id);

    Cliente getById(Integer id);
}
