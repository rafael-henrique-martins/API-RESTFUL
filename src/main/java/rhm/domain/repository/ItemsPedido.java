package rhm.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rhm.domain.entity.ItemPedido;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
