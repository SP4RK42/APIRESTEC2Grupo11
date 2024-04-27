package pe.edu.cibertec.APIRESTEC2Grupo11.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.APIRESTEC2Grupo11.model.bd.Farmaco;
import pe.edu.cibertec.APIRESTEC2Grupo11.repository.FarmacoRepository;

@AllArgsConstructor
@Service
public class FarmacoService {
    private FarmacoRepository farmacoRepository;

    public Farmaco registrarFarmaco(Farmaco farmaco) {
        return farmacoRepository.save(farmaco);
    }
}
