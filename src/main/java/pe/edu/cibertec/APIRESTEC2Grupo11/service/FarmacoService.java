package pe.edu.cibertec.APIRESTEC2Grupo11.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.APIRESTEC2Grupo11.model.Farmaco;
import pe.edu.cibertec.APIRESTEC2Grupo11.repository.FarmacoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FarmacoService implements IFarmacoService {

    private final FarmacoRepository farmacoRepository;

    @Autowired
    public FarmacoService(FarmacoRepository farmacoRepository) {
        this.farmacoRepository = farmacoRepository;
    }

    @Override
    public List<Farmaco> getAllFarmacos() {
        return farmacoRepository.findAll();
    }

    @Override
    public Optional<Farmaco> getFarmacoById(Integer id) {
        return farmacoRepository.findById(id);
    }

    @Override
    public Farmaco createFarmaco(Farmaco farmaco) {
        return farmacoRepository.save(farmaco);
    }

    @Override
    public Farmaco updateFarmaco(Integer id, Farmaco farmaco) {
        if (farmacoRepository.existsById(id)) {
            farmaco.setIdFarmaco(id);
            return farmacoRepository.save(farmaco);
        } else {
            return null;
        }
    }

    @Override
    public void deleteFarmaco(Integer id) {
        farmacoRepository.deleteById(id);
    }
}