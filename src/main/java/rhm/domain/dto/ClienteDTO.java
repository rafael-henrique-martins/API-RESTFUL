package rhm.domain.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {
    private Integer id;
    private String nome;
    private String cpf;

    public ClienteDTO(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}

