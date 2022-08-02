package rhm.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import rhm.domain.entity.Cliente;
import rhm.domain.repository.Clientes;

import java.util.Optional;

@Controller
public class ClientController {

    private Clientes clientes;

    public ClientController(Clientes clientes) {
        this.clientes = clientes;
    }

    @GetMapping("/api/clientes/{id}")
    @ResponseBody
    public ResponseEntity<Cliente> getClieneteById(@PathVariable Integer id) {
        Optional<Cliente> cliente = clientes.findById(id);
        if (cliente.isPresent()) {
            return ResponseEntity.ok(cliente.get());
        }
        return ResponseEntity.notFound().build();

    }

    @PostMapping("/api/clientes")
    @ResponseBody
    public ResponseEntity save(@RequestBody Cliente cliente) {
        Cliente clientesalvo = clientes.save(cliente);
        return ResponseEntity.ok(clientesalvo);
    }

    @DeleteMapping("/api/clientes/{id}")
    @ResponseBody
    public ResponseEntity delete(@PathVariable Integer id) {
        Optional<Cliente> cliente = clientes.findById(id);
        if (cliente.isPresent()) {
            clientes.delete(cliente.get());
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/api/clientes/{id}")
    @ResponseBody
    public ResponseEntity update(@PathVariable Integer id, @RequestBody Cliente cliente ) {
        return clientes.findById(id).map(clienteExistente -> {
            cliente.setId(clienteExistente.getId());
            clientes.save(cliente);
            return ResponseEntity.noContent().build();
        }).orElseGet(() -> ResponseEntity.noContent().build());
    }

}