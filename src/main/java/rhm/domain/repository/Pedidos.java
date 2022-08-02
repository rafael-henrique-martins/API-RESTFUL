package rhm.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rhm.domain.entity.Cliente;
import rhm.domain.entity.Pedido;

import java.util.List;

public interface Pedidos extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);
}
