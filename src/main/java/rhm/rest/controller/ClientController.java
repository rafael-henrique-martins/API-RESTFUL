package rhm.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import rhm.domain.dto.ClienteDTO;
import rhm.domain.entity.Cliente;
import rhm.domain.service.ClienteService;

@RestController
@RequestMapping("/api/clientes")
public class ClientController {

    @Autowired
    private ClienteService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Integer salvar(@RequestBody ClienteDTO dto) {
        Cliente cliente = service.salvar(dto);
        return cliente.getId();
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Object deletar(@PathVariable Integer id){
        Cliente cliente = service.delete(id);
        return null;
    }

    @GetMapping("{id}")
    public Cliente getById(@PathVariable Integer id){
        Cliente cliente = service.getById(id);
        return cliente;
    }


//    @GetMapping("/{id}")
//    public Cliente getClieneteById(@PathVariable Integer id) {
//        return clientes
//                .findById(id)
//                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado"));
//    }
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public Cliente save(@RequestBody Cliente cliente) {
//        return clientes.save(cliente);
//    }
//
//    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void delete(@PathVariable Integer id) {
//        clientes.findById(id)
//                .map( cliente -> {
//                    clientes.delete(cliente); return Void.class;
//                })
//                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado"));
//    }
//
//    @PutMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void update(@PathVariable Integer id, @RequestBody Cliente cliente) {
//        clientes.findById(id).map(clienteExistente -> {
//            cliente.setId(clienteExistente.getId());
//            clientes.save(cliente);
//            return clienteExistente;
//        }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado"));
//
//    }
//
//    @GetMapping
//    public List<Cliente> find(Cliente filtro) {
//        ExampleMatcher matcher = ExampleMatcher.matching()
//                .withIgnoreCase()
//                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
//        Example example = Example.of(filtro, matcher);
//        return clientes.findAll(example);
//    }
}
