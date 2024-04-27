package pe.edu.cibertec.APIRESTEC2Grupo11.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class FarmacoRequestDto {
    private String NomFarmaco;
    private String Composicion;
    private Date FechaVencimiento;
}
