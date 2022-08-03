package rhm.rest.controller;

import org.springframework.web.bind.annotation.*;
import rhm.domain.service.PedidoService;

@RestController
@RequestMapping("/{api/pedidos}")
public class PedidoController {

    private PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public Pedido save(@RequestBody Pedido pedido) {
//        return pedidos.save(pedido);
//    }
//
//    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void delete(@PathVariable Integer id) {
//        pedidos.findById(id)
//                .map(existePedido -> {
//                    pedidos.delete(existePedido);
//                    return Void.class;
//                })
//                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, " Pedido não encontrado"));
//    }
//
//    @PutMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void update(@PathVariable Integer id, @RequestBody Pedido pedido) {
//        pedidos.findById(id)
//                .map(existePedido -> {
//                    pedido.setId(existePedido.getId());
//                    pedidos.save(pedido);
//                    return existePedido;
//                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, " Pedido não encontrado"));
//    }
//
//    @GetMapping("/{id}")
//    public Pedido getPedidoById(@PathVariable Integer id) {
//        return pedidos.findById(id)
//                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, " Pedido não encontrado"));
//    }
//
//    @GetMapping
//    public List<Pedido> find(Pedido filtro){
//        ExampleMatcher matcher = ExampleMatcher.matching()
//                .withIgnoreCase()
//                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
//        Example example = Example.of(filtro, matcher);
//        return pedidos.findAll(example);
//    }
}
