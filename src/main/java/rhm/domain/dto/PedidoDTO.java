package rhm.domain.dto;
//{
//    "cliente":1,
//    "total":10,
//    "itens":
//        [{
//            "produto":1,
//            "quantidade":10
//        }]
//}


import java.math.BigDecimal;
import java.util.List;

public class PedidoDTO {
    private Integer cliente;
    private BigDecimal total;
    private List<ItemPedidoDTO> items;
}
