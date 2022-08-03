package rhm.domain.service.impl;

import org.springframework.stereotype.Service;
import rhm.domain.repository.Pedidos;
import rhm.domain.service.PedidoService;


@Service
public class PedidoServiceImpl implements PedidoService {

    private Pedidos repository;

    public PedidoServiceImpl(Pedidos repository) {
        this.repository = repository;
    }
}
