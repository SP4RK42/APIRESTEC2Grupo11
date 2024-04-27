package pe.edu.cibertec.APIRESTEC2Grupo11.model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name = "Farmaco")
public class Farmaco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdFarmaco;
    private String NomFarmaco;
    private String Composicion;
    private Date FechaVencimiento;
}
