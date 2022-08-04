package rhm.domain.service;
import rhm.domain.dto.PedidoDTO;
import rhm.domain.entity.Pedido;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);
}
