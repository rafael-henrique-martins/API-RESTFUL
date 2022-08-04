package rhm.domain.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rhm.domain.dto.ClienteDTO;
import rhm.domain.entity.Cliente;
import rhm.domain.exception.RegraNegocioException;
import rhm.domain.repository.Clientes;
import rhm.domain.service.ClienteService;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final Clientes clienteRepository;

    @Override
    @Transactional
    public Cliente salvar(ClienteDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setId(dto.getId());
        cliente.setCpf(dto.getCpf());
        cliente.setNome(dto.getNome());

        clienteRepository.save(cliente);
        return cliente;
    }

    @Override
    @Transactional
    public Cliente delete(Integer id) {
        clienteRepository.findById(id)
                .map(seExistir -> { clienteRepository.delete(seExistir); return Void.TYPE;})
                .orElseThrow(() -> new RegraNegocioException("Código de cliente inválido."));
        return null;
    }

    @Override
    @Transactional
    public Cliente getById(Integer id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new RegraNegocioException("Cliente Não encontrado."));

    }
}
