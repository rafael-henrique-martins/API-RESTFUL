package rhm.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rhm.domain.entity.Produto;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
