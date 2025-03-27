package umg.progra3.Lombok;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class lombok {
    private Long id;
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;

}
