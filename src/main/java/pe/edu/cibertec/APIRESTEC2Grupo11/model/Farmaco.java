package pe.edu.cibertec.APIRESTEC2Grupo11.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name = "farmaco")
public class Farmaco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfarmaco")
    private Integer IdFarmaco;
    @Column(name = "nomfarmaco")
    private String NomFarmaco;
    @Column(name = "composicion")
    private String Composicion;
    @Column(name = "fechavencimiento")
    private Date FechaVencimiento;
}
