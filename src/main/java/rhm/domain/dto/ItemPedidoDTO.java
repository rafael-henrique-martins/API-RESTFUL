package rhm.domain.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//{
//    "cliente":1,
//    "total":10,
//    "itens":
//        [{
//            "produto":1,
//            "quantidade":10
//        }]
//}

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemPedidoDTO {
    private Integer produto;
    private Integer quantidade;
}
