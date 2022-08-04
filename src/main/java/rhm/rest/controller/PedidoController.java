package rhm.rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import rhm.domain.dto.PedidoDTO;
import rhm.domain.entity.Pedido;
import rhm.domain.service.PedidoService;

@RestController
@RequestMapping("/{api/pedidos}")
public class PedidoController {
    @Autowired
    private PedidoService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Integer save (@RequestBody PedidoDTO dto){
        Pedido pedido = service.salvar(dto);
        return pedido.getId();
    }


}
